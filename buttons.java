
package guiexamples;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author AB
 */
class buttonActionDemo extends JFrame implements ActionListener {
    JComboBox course;
    JButton btnAction, chButton;
    JTextField screen;
    JTextArea chDisplay;
    JPanel panel = new JPanel();
    JCheckBox ch1, ch2, ch3, ch4, ch5;
    buttonActionDemo(){
        course = new JComboBox();
        course.addItem("Java");
        course.addItem("PhP");
        course.addItem("Javascript");
        course.addItem("Visual Basic");
        course.addItem("Kotlin");
        
        //Initialise the Button
        btnAction = new JButton("Get Drop Down Item");
        btnAction.addActionListener(this);
        chButton = new JButton("Get Checked Items");
        chButton.addActionListener(this);
        
        //Initialise the Text Field
        screen = new JTextField("Select a course to display");
        chDisplay = new JTextArea(5, 20);
        
        //Initialise Check Box
        ch1 = new JCheckBox("Java");
        ch2 = new JCheckBox("PhP");
        ch3 = new JCheckBox("Javascript");
        ch4 = new JCheckBox("Python");
        ch5 = new JCheckBox("Kotlin");
        
        //Adding the Check Boxes the Panel
        panel.add(ch1);
        panel.add(ch2);
        panel.add(ch3);
        panel.add(ch4);
        panel.add(ch5);
        
        add(course);
        add(btnAction);
        add(screen);
        add(panel);
        add(chButton);
        add(chDisplay);
        
        setTitle("Combo Box Demo");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500, 200);
        setLocation(300, 100);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        
    }
    
    public void actionPerformed(ActionEvent e){
        String opt = e.getActionCommand();
        
        if(opt.equals(btnAction.getText())){
            String itemSelect = (String)course.getSelectedItem();
            screen.setText(itemSelect);
        }
        else if(opt.equals(chButton.getText())){
            String select = "";
            if(ch1.isSelected()){
                select = select + ch1.getText() + '\n';
            }
            if(ch2.isSelected()){
                select = select + ch2.getText() + '\n';
            }
            if(ch3.isSelected()){
                select = select + ch3.getText() + '\n';
            }
            if(ch4.isSelected()){
                select = select + ch4.getText() + '\n';
            }
            if(ch5.isSelected()){
                select = select + ch5.getText() + '\n';
            }
            chDisplay.setText(select);
        }
    }
}

public class ComboBoxDemo {
        public static void main(String[] args){
            buttonActionDemo demo = new buttonActionDemo();
        }
}
