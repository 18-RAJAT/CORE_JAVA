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
        frame.setVisible(true);
        btn.setBackground(Color.blue);
    }
}