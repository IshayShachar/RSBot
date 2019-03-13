package Chopper.Tasks;

import Chopper.Task;
import org.powerbot.script.rt4.ClientContext;

public class Drop extends Task<ClientContext> {
    public Drop(ClientContext arg0) {
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
