package Chopper.Utils;

import org.powerbot.script.Area;

public class AreaEntry {
    private Area bankArea, treeArea;
    private String areaName;

    public AreaEntry(Area bankArea, Area treeArea, String areaName) {
        this.bankArea = bankArea;
        this.treeArea = treeArea;
        this.areaName = areaName;
    }

    public Area getBankArea() {
        return bankArea;
    }

    public Area getTreeArea() {
        return treeArea;
    }

    public String getAreaName() {
        return areaName;
    }

    @Override
    public String toString() {
        return this.areaName;
    }
}
