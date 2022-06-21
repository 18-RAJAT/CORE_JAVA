package JAVA_EXAM;

import javax.swing.*;
import java.awt.*;
public class frames {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Top ");
        JLabel label=new JLabel("Print");
        JButton btn=new JButton();
        frame.add(label);
        btn.setText("Button");
        frame.add(btn);
        frame.setSize(200,300);
        JLabel l=new JLabel("Adding ");
        frame.add(l);
        btn.setSize(200,100);

        btn.setBackground(Color.blue);
        JRadioButton btn2=new JRadioButton();
        btn2.setText("New radio");
        frame.add(btn2);

        JRadioButton btn3=new JRadioButton();
        btn3.setText("New radio");
        frame.add(btn3);

        JRadioButton btn4=new JRadioButton();
        btn4.setText("New radio");
        frame.add(btn4);
        frame.setVisible(true);
    }
}