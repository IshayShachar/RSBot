package Chopper;

import Chopper.Tasks.Chop;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Script.Manifest(name = "Chopper", properties = "author=Shachar & Ishay; topic=999; client=4;",description = "Our first WC script")
public class Chopper extends PollingScript<ClientContext> {
    private List<Task> taskList = new ArrayList<Task>();

    @Override
    public void start() {
        taskList.addAll(Collections.singletonList(new Chop(ctx)));
    }
    @Override
    public void poll() {
        for (Task task : taskList) {
            if (task.activate())
                task.execute();
        }
    }
}
