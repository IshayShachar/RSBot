/*
 * Created by JFormDesigner on Wed Mar 13 19:31:33 IST 2019
 */

package Chopper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author shachar yekutiel
 */
public class GUI extends JFrame {
    public GUI() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {

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
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        btnStart = new JButton();

        //======== frame1 ========
        {
            frame1.setTitle("AIO Woodcutter");
            Container frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)frame1ContentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
            ((GridBagLayout)frame1ContentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
            ((GridBagLayout)frame1ContentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)frame1ContentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

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
            cbTree.setModel(new DefaultComboBoxModel(new String[] {
                "Normal",
                "Oak",
                "Willow",
                "Maple",
                "Yew",
                "Magic",
                "Redwood"
            }));
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

            //---- radioButton1 ----
            radioButton1.setText("Banking");
            frame1ContentPane.add(radioButton1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- radioButton2 ----
            radioButton2.setText("Powerchopping");
            frame1ContentPane.add(radioButton2, new GridBagConstraints(2, 2, 3, 1, 0.0, 0.0,
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
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
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
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton btnStart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
