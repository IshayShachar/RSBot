package Chopper;

import Chopper.Tasks.Bank;
import Chopper.Tasks.Chop;
import Chopper.Tasks.Drop;
import Chopper.Tasks.Walk;
import org.powerbot.script.Condition;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

@Script.Manifest(name = "Chopper", properties = "author=Shachar & Ishay; topic=999; client=4;", description = "Our first WC script")
public class Chopper extends PollingScript<ClientContext> {
    private List<Task> taskList = new ArrayList<Task>();
    GUI gui = GUI.getInstance();

    @Override
    public void start() {
        gui.showGui();
        while (!gui.canStart) {
            Condition.sleep(100);
        }
        taskList.addAll(Arrays.asList(new Chop(ctx, GUI.SELECTED_TREES)));
        Logger log = Logger.getLogger(getClass().getSimpleName());
        log.log(Level.INFO, "Banking: " + gui.isBanking);

        if (gui.isBanking){
            taskList.addAll(Arrays.asList(new Bank(ctx), new Walk(ctx)));
        } else{
            taskList.add(new Drop(ctx));
        }
    }

    @Override
    public void poll() {
        for (Task task : taskList) {
            if (task.activate())
                task.execute();
        }
    }
}
