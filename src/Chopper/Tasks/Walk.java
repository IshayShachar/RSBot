package Chopper.Tasks;

import Chopper.Task;
import org.powerbot.script.Area;
import org.powerbot.script.rt4.ClientContext;

public class Walk extends Task<ClientContext> {
    public static Area BANK_AREA;
    public static Area TREES_AREA;

    public Walk(ClientContext arg0, Area bankArea, Area treesArea) {
        super(arg0);

        BANK_AREA = bankArea;
        TREES_AREA = treesArea;
    }

    @Override
    public boolean activate() {
        return false;
    }

    @Override
    public void execute() {

    }
}
