package Chopper.Tasks;

import Chopper.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.Filter;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

import java.util.concurrent.Callable;

public class Bank extends Task<ClientContext> {
    public Bank(ClientContext arg0) {
        super(arg0);
    }


    @Override
    public boolean activate() {
        // if bag is full AND if we are in the bank area
        return ctx.inventory.isFull() && ctx.bank.inViewport();
    }

    @Override
    public void execute() {
        if (ctx.bank.opened()){
            ctx.bank.depositAllExcept("Rune axe", "Steel axe", "Iron axe", "Dragon axe");

            ctx.bank.close();
        } else{
            ctx.bank.open();
            // anti spam-click
            Condition.wait(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    return ctx.bank.opened();
                }
            });
        }
    }
}
