package Chopper;

import org.powerbot.script.PollingScript;
import org.powerbot.script.rt4.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chopper extends PollingScript<ClientContext> {
    private List<Task> taskList = new ArrayList<Task>();

    @Override
    public void start() {
        taskList.addAll(Arrays.asList(new Chop(ctx), new Walk(ctx), new Drop(ctx), new Bank(ctx)))
    }
    @Override
    public void poll() {

    }
}
