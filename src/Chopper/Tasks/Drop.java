package Chopper.Tasks;

import Chopper.Task;
import Chopper.Utils.RandomUtil;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;
import org.powerbot.script.rt4.ItemQuery;

public class Drop extends Task<ClientContext> {
    private final static int MIN_SLEEP = 800, MAX_SLEEP = 1300;

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
        // TODO filter by log ID rather than by name
        ItemQuery<Item> itemQuery = ctx.inventory.select().name("Logs");
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
