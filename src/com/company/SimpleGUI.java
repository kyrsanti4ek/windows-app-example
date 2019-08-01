package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("clear queue");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("select env:");
//    private JRadioButton radioButton1 = new JRadioButton("sunbird-s3");
    private JRadioButton radioButton2 = new JRadioButton("alpha-s3");
    private JCheckBox checkBox = new JCheckBox("sunbird-s3",false);
    private JCheckBox checkBox2 = new JCheckBox("alpha-s3",false);
    private JCheckBox checkBox3 = new JCheckBox("winter-s3",false);



    public SimpleGUI(){
        super("clear queue");
        this.setBounds(100,100,250,100); //form size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // for form closing

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
//        container.add(input);

        ButtonGroup buttonGroup = new ButtonGroup();  // group radiobutton
//        buttonGroup.add(radioButton1);
//        buttonGroup.add(radioButton2);
//        container.add(radioButton1);
//        radioButton1.setSelected(true);
//        container.add(radioButton2);
        container.add(checkBox);
        container.add(checkBox2);
        container.add(checkBox3);
        container.add(button);
        button.addActionListener(new ButtonEventListener());

    }


    class ButtonEventListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {   // if button clicked

//            String message ="";
//            message += "button was pressed\n" + input.getText() + "\n" ;
//            message += (radioButton1.isSelected() ? "Radio #1" : "Radio #2") + " is selected\n";
//            message += "Checkbox is " + ((checkBox.isSelected()) ? "checked" : "unchecked");
//            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);


        }
    }

}

