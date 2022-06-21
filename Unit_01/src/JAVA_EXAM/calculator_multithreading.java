package JAVA_EXAM;

import java.lang.*;

import java.util.*;
public class calculator_multithreading {

// Thread A( for arithematic operations)

    class A1 extends Thread

    {

        int i,j;

        A1(int x,int y)

        {

            i=x;

            j=y;

        }

        public void run()

        {

            System.out.println("THREAD A:: ARITHEMATIC OPERATIONS");




            System.out.println("SUM "+(i+j));

            System.out.println( "DIFFERENCE "+(i-j));

            System.out.println(" PRODUCT  "+(i*j));

            System.out.println("RATIO  "+(i/j));

            System.out.println("POWER  "+Math.pow(i,j));

            System.out.println("END OF A");

        }

    }

// Thread B (for trignometric operations)

    class B1 extends Thread

    {

        int i;

        B1(int x)

        {

            i=x;

        }

        public void run()

        {
            System.out.println("THREAD B:: TRIGNOMETRIC OPERATIONS");

            System.out.println("SINE OF "+i+""+Math.sin(i));

            System.out.println("COSINE OF "+i+""+Math.cos(i));

            System.out.println("TAN OF "+i+"  "+Math.tan(i));

            System.out.println("SQUARE ROOT OF  "+i+"   "+Math.sqrt(i));

            System.out.println("END OF B");

        }

    }

// MAIN CLASS

    class Operate

    {

        public static void main(String args[])

        {

            Scanner s=new Scanner(System.in);

            System.out.println("ENTER TWO VALUES FOR ARITHEMATIC  OPERATIONS");

            int x=s.nextInt();

            int y=s.nextInt();

            System.out.println("ENTER A VALUE FOR TRIGNOMETRIC OPERATIONS");

            int z=s.nextInt();

            A1 a=new A1(x,y);

            B1 b=new B1(z);



            a.start();

            b.start();

        }

    }
}
