package practice.OOPS;

public class Initialization_through_method {

    public static class student {
        int num;
        String name;

        void insertRecord( int n,String s) {
            num = n;
            name = s;
        }

        void display() {
            System.out.println(num + " " + name);
        }

    }

            public static void main(String[]args)
            {
                student s1 = new student();
                student s2 = new student();

                s1.insertRecord(11,"RJ");
                s2.insertRecord(22,"MM");

                s1.display();
                s2.display();
            }
        }


