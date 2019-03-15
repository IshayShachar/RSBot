package Chopper.Utils;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.TilePath;

public class Constants {
    //#region TREES
    public static final Integer[] NORMAL_TREES = {1276, 1278};
    public static final Integer[] OAK_TREES = {1751};
    public static final Integer[] WILLOW_TREES = {1756, 1760};
    //#endregion

    // TODO change tree ids to actual variables
    public static final int[] LOGS_ARR = {1511, 1521, 1515, 1519};

    //#region DRAYNOR AREAS
    public static final Area DRAYNOR_BANK_AREA = new Area(new Tile(3088, 3247, 0), new Tile(3097, 3239, 0));
    public static final Area DRAYNOR_WILLOWS_AREA =
            new Area(
                    new Tile(3082, 3239, 0),
                    new Tile(3091, 3237, 0),
                    new Tile(3091, 3225, 0),
                    new Tile(3082, 3226, 0));
//    #endregion

    //#region Lumbridge Areas

    //TODO Change coordinates to real ones
    public static final Area LUMBRIDGE_BANK_AREA = new Area(new Tile(3088, 3247, 0), new Tile(3097, 3239, 0));
    public static final Area LUMBRIDGE_NORMALS_AREA =
            new Area(
                    new Tile(3082, 3239, 0),
                    new Tile(3091, 3237, 0),
                    new Tile(3091, 3225, 0),
                    new Tile(3082, 3226, 0));
    //#endregion

    //#region Camelot Areas

    //TODO Change coordinates to real ones
    public static final Area CAMELOT_BANK_AREA = new Area(new Tile(3088, 3247, 0), new Tile(3097, 3239, 0));
    public static final Area CAMELOT_NORMALS_AREA =
            new Area(
                    new Tile(3082, 3239, 0),
                    new Tile(3091, 3237, 0),
                    new Tile(3091, 3225, 0),
                    new Tile(3082, 3226, 0));
    //#endregion
}
