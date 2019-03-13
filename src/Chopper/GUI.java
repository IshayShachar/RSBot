/*
 * Created by JFormDesigner on Tue Mar 12 23:54:07 IST 2019
 */

package Chopper;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class GUI extends JFrame {
    public GUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - shachar yekutiel
        frame1 = new JFrame();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label2 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        button1 = new JButton();
        comboBox2 = new JComboBox();

        //======== frame1 ========
        {
            frame1.setTitle("AIO Woodcutting");
            Container frame1ContentPane = frame1.getContentPane();

            //---- label1 ----
            label1.setText("Tree:");

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel(new String[] {
                "Normal",
                "Oak",
                "Willow",
                "Teak",
                "Yew",
                "Magic",
                "Mahogany",
                "Redwood"
            }));

            //---- label2 ----
            label2.setText("Location:");

            //---- radioButton1 ----
            radioButton1.setText("Powechopping");

            //---- radioButton2 ----
            radioButton2.setText("Banking");

            //---- button1 ----
            button1.setText("text");

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, frame1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(frame1ContentPaneLayout.createParallelGroup()
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(radioButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton1)
                                .addContainerGap(161, Short.MAX_VALUE))))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frame1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButton2)
                            .addComponent(radioButton1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - shachar yekutiel
    private JFrame frame1;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button1;
    private JComboBox comboBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
