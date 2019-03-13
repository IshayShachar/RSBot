package Chopper.Tasks;

import Chopper.Task;
import Chopper.Utils.RandomUtil;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;
import org.powerbot.script.rt4.ItemQuery;

public class Drop extends Task<ClientContext> {
    private final static int MIN_SLEEP = 380, MAX_SLEEP = 700;
    private final static int[] LOGS_ARR = {1511, 1521, 1515};

    public Drop(ClientContext arg0) {
        super(arg0);
    }

    @Override
    public boolean activate() {
        // only start dropping when inventory is full
        return ctx.inventory.isFull();
    }

    @Override
    public void execute() {
        ItemQuery<Item> itemQuery = ctx.inventory.select().id(LOGS_ARR);
        System.out.println(String.format("Found %d logs.", itemQuery.count()));

        for (Item item :
                itemQuery) {
            if (item.valid()) {
                item.interact("Drop");
                try {
                    Thread.sleep(RandomUtil.getRandomSleepInMS(MIN_SLEEP, MAX_SLEEP));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
