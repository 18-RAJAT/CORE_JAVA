package JAVA_SWING_PRACTICE;

import javax.swing.*;

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
        JLabel l=new JLabel("Hello");
        JLabel ll=new JLabel("World");

        add(l);
        add(ll);

        setVisible(true);
        setSize(400,400);
    }
}