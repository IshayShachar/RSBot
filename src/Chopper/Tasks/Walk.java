package Chopper.Tasks;

import Chopper.Task;
import org.powerbot.script.rt4.ClientContext;

public class Walk extends Task<ClientContext> {

    public Walk(ClientContext arg0) {
        super(arg0);
    }

    @Override
    public boolean activate() {
        return false;
    }

    @Override
    public void execute() {

    }
}
