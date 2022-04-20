package practice.OOPS;

public class ractangle {
    static class rectangle{
        int length;
        int width;

        void insert(int l,int w)
        {
            length = l;
            width = w;
        }

        void  find()
        {
            System.out.println(length * width);
        }

            public static void main(String[]args)
            {
                rectangle r1 = new rectangle();
                rectangle r2 = new rectangle();

                r1.insert(100,20);
                r2.insert(20,30);

                r1.find();
                r2.find();
            }
        }
    }
