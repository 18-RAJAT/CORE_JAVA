package practice.OOPS;

public class Initialization_through_reference {

     static class Student{
        int roll;
        String name;
    }


        public static void main(String[]args)
        {
            Student s1 = new Student();

            s1.roll = 41;
            s1.name = "john";

            System.out.println(s1.roll + " " + s1.name );
        }
    }

