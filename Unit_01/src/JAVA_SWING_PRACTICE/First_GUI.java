package JAVA_SWING_PRACTICE;
import javax.swing.*;

public class First_GUI {
    public static void main(String[]args)
    {
        abc obj=new abc();
//        obj.setVisible(true);
//        obj.setSize(400,400);
    }
}
class abc extends JFrame
{
    public abc()
    {
        JLabel l=new JLabel("Hello Java");
        add(l);
      setVisible(true);
      setSize(400,400);
    }
}
