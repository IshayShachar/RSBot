package Chopper.Tasks;

import Chopper.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;

import java.util.concurrent.Callable;


public class Chop extends Task<ClientContext> {
    private final int[] trees;
    public Chop(ClientContext ctx, int[] treesArr) {
        super(ctx);
//        trees = new int[]{ 1276, 1278 };
        trees = treesArr;
    }

    @Override
    public boolean activate() {
        return ctx.inventory.count() < 28 && !ctx.objects.select().id(trees).isEmpty() && ctx.players.local().animation() == -1;
    }

    @Override
    public void execute() {
        GameObject treeObject = ctx.objects.select().id(trees).nearest().poll();
        if (treeObject.inViewport()) {
            if (treeObject.interact("Chop")) {
                Condition.wait(new Callable<Boolean>() {
                    @Override
                    public Boolean call() {
                        return ctx.players.local().animation() != -1;
                    }
                });
            }
        }

        else {
            ctx.movement.step(treeObject);
            ctx.camera.turnTo(treeObject);
        }
    }
}
