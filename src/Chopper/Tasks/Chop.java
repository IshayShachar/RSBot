package Chopper.Tasks;

import Chopper.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;

import java.util.concurrent.Callable;


public class Chop extends Task<ClientContext> {
    private int[] trees = { 1276, 1278 };
    public Chop(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.inventory.count() < 28 && !ctx.objects.select().id(trees).isEmpty() && ctx.players.local().animation() == -1;
    }

    @Override
    public void execute() {
        GameObject treeID = ctx.objects.select().id(trees).nearest().poll();
        if (treeID.inViewport()) {
            if (treeID.interact("Chop")) {
                Condition.wait(new Callable<Boolean>() {
                    @Override
                    public Boolean call() throws Exception {
                        return ctx.players.local().animation() != -1;
                    }
                });
            }
        }

        else {
            ctx.movement.step(treeID);
            ctx.camera.turnTo(treeID);
        }
    }
}
