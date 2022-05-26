
//Tasks of users(Multithreading)
/*
 * 1.Identify dependent and non dependent tasks in respective process...!!
 *2.Insert selective tasks into threads...!!
 * 3.Start those threads...!!
 * */

package Unit_03;

import java.util.Scanner;

public class P_16_Multithreading {
    public static void main(String[]args)
    {
        Thread t1= new Thread(new t1(),"t1");
        Thread t2= new Thread(new t2(),"t2");
        t1.start();t2.start();
    }

}

class c1{
    void  show1()
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println(a);
        System.out.println("Done with show1..");
        obj.close();
    }
}

class c2{
    void show2()
    {
        for(int i=0;i<10;++i)
        {
            System.out.println(i + "Hey!!");
        }
    }
}


class t1 extends Thread{
    public void run()
    {
      Scanner sc=new Scanner(System.in);
      int r =sc.nextInt();
      System.out.println(r);
    }
}

class t2 extends Thread{
    public void run()
    {
        for(int i=0;i<10;++i)
        {
            System.out.println("Run");
        }
    }
}