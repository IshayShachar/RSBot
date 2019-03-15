/*
 * Created by JFormDesigner on Wed Mar 13 19:31:33 IST 2019
 */

package Chopper.Gui;

import Chopper.Utils.AreaEntry;
import Chopper.Utils.Constants;

import static Chopper.Utils.Constants.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author shachar yekutiel
 */
public class GUI extends JFrame {
    private static GUI OUR_INSTANCE = new GUI();
    private HashMap<String, ArrayList<Integer>> mTreesMap;
    private HashMap<String, ArrayList<AreaEntry>> mAreasMap;
    public static int[] SELECTED_TREES;
    public boolean canStart = false;
    public boolean isBanking = false;

    private GUI() {
        initComponents();
        initTreesMap();
        initAreasMap();
        initLocations();
    }

    public static GUI getInstance() {
        return OUR_INSTANCE;
    }

    private void initTreesMap() {
        mTreesMap = new HashMap<String, ArrayList<Integer>>() {{
            put("Normal", new ArrayList<Integer>(Arrays.asList(Constants.NORMAL_TREES)));
            put("Oak", new ArrayList<Integer>(Arrays.asList(Constants.OAK_TREES)));
            put("Willow", new ArrayList<Integer>(Arrays.asList(Constants.WILLOW_TREES)));
        }};
    }

    private void initAreasMap() {
        mAreasMap = new HashMap<String, ArrayList<AreaEntry>>() {{

            //#region NORMALS
            put("Normal", new ArrayList<AreaEntry>(Arrays.asList(
                    new AreaEntry(CAMELOT_BANK_AREA, CAMELOT_NORMALS_AREA, "Camelot"),
                    new AreaEntry(LUMBRIDGE_BANK_AREA, LUMBRIDGE_NORMALS_AREA, "Lumbridge"))));
            //#endregion

            //#region WILLOWS

            put("Willow", new ArrayList<AreaEntry>(Arrays.asList(
                    new AreaEntry(DRAYNOR_BANK_AREA, DRAYNOR_WILLOWS_AREA, "Draynor"))));

            //#endregion
        }};
    }

    private void button1ActionPerformed(ActionEvent e) {
        Object selectedTree = getSelectedTree();
        if (selectedTree != null) {
            Logger log = Logger.getLogger(getClass().getSimpleName());
            log.log(Level.INFO, "Selected tree: " + selectedTree.toString());

            setSelectedTree(selectedTree.toString());
            isBanking = rbBanking.isSelected();
        }
    }

    private void setSelectedTree(String treeName) {
        ArrayList<Integer> arr = mTreesMap.get(treeName);
        SELECTED_TREES = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            int selectedTree = arr.get(i);
            SELECTED_TREES[i] = selectedTree;
        }

        canStart = true;
        frame1.setVisible(false);
    }

    private void initLocations() {
        Object selectedTree = cbTree.getSelectedItem();
        if (selectedTree != null) {
            ArrayList<AreaEntry> selectedTreeLocations = mAreasMap.get(selectedTree.toString());

            if (selectedTreeLocations != null) {
                // remove items so it doesn't recycle the existing ones
                cbLoc.removeAllItems();
                for (AreaEntry loc :
                        selectedTreeLocations) {
                    cbLoc.addItem(loc);
                }
                // not sure if we need this line
                cbLoc.repaint();
            } else {
                // if there aren't any locations for that tree, don't display anything
                cbLoc.removeAllItems();
            }
        }
    }

    /**
     * gets the selected tree in the trees combo box
     *
     * @return the selected tree to chop
     */
    private Object getSelectedTree() {
        return cbTree.getSelectedItem();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - shachar yekutiel
        frame1 = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        cbTree = new JComboBox();
        label3 = new JLabel();
        cbLoc = new JComboBox();
        rbBanking = new JRadioButton();
        rbPower = new JRadioButton();
        btnStart = new JButton();

        //======== frame1 ========
        {
            frame1.setTitle("AIO Woodcutter");
            Container frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout) frame1ContentPane.getLayout()).columnWidths = new int[]{0, 0, 0, 0, 0, 0};
            ((GridBagLayout) frame1ContentPane.getLayout()).rowHeights = new int[]{0, 0, 0, 0, 0};
            ((GridBagLayout) frame1ContentPane.getLayout()).columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout) frame1ContentPane.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label1 ----
            label1.setText("Tree:");
            frame1ContentPane.add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //---- label2 ----
            label2.setText("AIO Woodcutter");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 15f));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            frame1ContentPane.add(label2, new GridBagConstraints(1, 0, 4, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- comboBox1 ----
            cbTree.setModel(new DefaultComboBoxModel(new String[]{
                    "Normal",
                    "Oak",
                    "Willow",
                    "Maple",
                    "Yew",
                    "Magic",
                    "Redwood"
            }));
            cbTree.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    initLocations();
                }
            });


            frame1ContentPane.add(cbTree, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //---- label3 ----
            label3.setText("Location:");
            frame1ContentPane.add(label3, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            frame1ContentPane.add(cbLoc, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- rbBanking ----
            rbBanking.setText("Banking");
            frame1ContentPane.add(rbBanking, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //---- rbPower ----
            rbPower.setText("Powerchopping");
            frame1ContentPane.add(rbPower, new GridBagConstraints(2, 2, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- btnStart ----
            btnStart.setText("Start");
            btnStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1ActionPerformed(e);
                }
            });
            frame1ContentPane.add(btnStart, new GridBagConstraints(0, 3, 5, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rbBanking);
        buttonGroup1.add(rbPower);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void showGui() {
        if (!frame1.isVisible()) {
            frame1.setVisible(true);
            frame1.setResizable(false);
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - shachar yekutiel
    private JFrame frame1;
    private JLabel label1;
    private JLabel label2;
    private JComboBox cbTree;
    private JLabel label3;
    private JComboBox cbLoc;
    private JRadioButton rbBanking;
    private JRadioButton rbPower;
    private JButton btnStart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
