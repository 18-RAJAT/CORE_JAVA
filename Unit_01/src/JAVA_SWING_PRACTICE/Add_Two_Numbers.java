package JAVA_SWING_PRACTICE;

import javax.swing.*;
import java.awt.*;//Flowlayout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_Two_Numbers {
    public static void main(String[]args)
    {
        addition obj=new addition();
    }
}
class addition extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b;
    JLabel l;
    public addition()
    {
         t1=new JTextField(20);
         t2=new JTextField(20);
         b=new JButton("OK");
         l=new JLabel("RESULT");

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this);//It is an interface
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());

        int addition=num1+num2;
        l.setText(addition+" ");

    }
}
