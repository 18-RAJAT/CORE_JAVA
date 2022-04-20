package practice.OOPS;

public class Main_outside_the_class {

    static class Student {
        int id;
        String name;
    }

    class student2{

        public static void main(String[]args)
        {
            Student s1 = new Student();
            System.out.println(s1.id);
            System.out.println(s1.name);
        }
    }
}
