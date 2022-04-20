package practice.OOPS;

public class Main_within_the_class {

        static class Student
        {
          int id;
          String name;

            public static void main(String[] args)
            {
                Student s1 = new Student();

                System.out.println(s1.id);
                System.out.println(s1.name);
            }
    }
}
