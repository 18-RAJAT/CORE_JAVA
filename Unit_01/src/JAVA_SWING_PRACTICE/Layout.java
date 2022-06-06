package JAVA_SWING_PRACTICE;

import javax.swing.*;
import java.awt.*;

public class Layout {
    public static void main(String[]args)
    {
            first obj=new first();
    }
}
class first extends JFrame
{
    public first()
    {
        //center of JFrame and combine them
        setLayout(new FlowLayout());//Flowlayout,Grid,null layouts...!!

        JLabel l=new JLabel("Hello");
        JLabel ll=new JLabel("World");

        add(l);
        add(ll);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}