package Chopper;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;

public abstract class Task<C extends ClientContext> extends ClientAccessor<C> {
    public Task(C arg0) {
        super(arg0);
    }

    public abstract boolean activate();
    public abstract void execute();
}
