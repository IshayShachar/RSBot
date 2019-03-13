package Chopper.Tasks;

import Chopper.Task;
import Chopper.Utils.Constants;
import Chopper.Utils.RandomUtil;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;
import org.powerbot.script.rt4.ItemQuery;

public class Drop extends Task<ClientContext> {
    private final static int MIN_SLEEP = 200, MAX_SLEEP = 500;

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
        ItemQuery<Item> itemQuery = ctx.inventory.select().id(Constants.LOGS_ARR);
        System.out.println(String.format("Found %d logs.", itemQuery.count()));

        for (Item item :
                itemQuery) {
            if (item.valid()) {
                ctx.inventory.drop(item, true);
                try {
                    Thread.sleep(RandomUtil.getRandomSleepInMS(MIN_SLEEP, MAX_SLEEP));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
