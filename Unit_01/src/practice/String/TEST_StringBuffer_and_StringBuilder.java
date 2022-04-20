package practice.String;

public class TEST_StringBuffer_and_StringBuilder {
    public static void main(String[]args)
    {
        long startTime = System.currentTimeMillis();
        StringBuffer s = new StringBuffer("Hello");

        for(int i=0;i<10000;++i)
        {
            s.append("World");
        }
        System.out.println("Time taken string buffer " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder s1 = new StringBuilder("Hello");

        for(int i=0;i<100000;++i)
        {
            s1.append("World");
        }

        System.out.println("Time taken by string builder " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
