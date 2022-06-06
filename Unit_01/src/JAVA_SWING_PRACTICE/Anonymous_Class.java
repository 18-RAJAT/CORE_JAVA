package JAVA_SWING_PRACTICE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous_Class {
    public static void main(String[]args)
    {
        addition obj=new addition();
    }
}
class Addition extends JFrame
{
    JTextField t1,t2;
    JButton b;
    JLabel l;
    public Addition()
    {
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("OK");
        l=new JLabel("RESULT");

        add(t1);
        add(t2);
        add(b);
        add(l);

        ActionListener al=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());

                int addition=num1+num2;
                l.setText(addition+" ");
            }
        };
        b.addActionListener(al);//It is an interface
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}