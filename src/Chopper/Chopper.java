package Chopper;

import Chopper.Tasks.Chop;
import Chopper.Tasks.Drop;
import org.powerbot.script.Condition;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@Script.Manifest(name = "Chopper", properties = "author=Shachar & Ishay; topic=999; client=4;",description = "Our first WC script")
public class Chopper extends PollingScript<ClientContext> {
    private List<Task> taskList = new ArrayList<Task>();
    GUI gui = new GUI();

    @Override
    public void start() {
        gui.showGui();

        Condition.wait(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                return gui.canStart;
            }
        });

        taskList.addAll(Arrays.asList(new Chop(ctx, GUI.SELECTED_TREES), new Drop(ctx)));
    }
    @Override
    public void poll() {
        for (Task task : taskList) {
            if (task.activate())
                task.execute();
        }
    }
}
