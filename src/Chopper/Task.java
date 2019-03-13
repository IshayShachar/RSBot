package Chopper;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;

/**
 * A class represents a task to be done on the {@link org.powerbot.script.rt4.Player}
 * @param <C> A generic client-context inherited class
 */
public abstract class Task<C extends ClientContext> extends ClientAccessor<C> {
    public Task(C arg0) {
        super(arg0);
    }

    public abstract boolean activate();
    public abstract void execute();
}
