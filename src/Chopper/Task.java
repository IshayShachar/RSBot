package Chopper;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;

/**
 * A class represents a task to be done on the {@link org.powerbot.script.rt4.Player}
 * @param <C> A generic {@link ClientContext} inherited class
 */
public abstract class Task<C extends ClientContext> extends ClientAccessor<C> {
    public Task(C arg0) {
        super(arg0);
    }

    /**
     * Predicate to see if we can {@link #execute()} the {@link Task}
     * @return whether the conditions for execution are met
     */
    public abstract boolean activate();

    /**
     * executes the {@link Task}. Called after {@link #activate()}
     */
    public abstract void execute();
}
