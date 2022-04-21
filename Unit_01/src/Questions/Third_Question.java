package Questions;

class Third_Question {
    static int i = 0;


    void display()
    {
        i++;
        System.out.println("Number of calls " + i);
    }
}

class abc
{
    public static void main(String args[])
    {
        Third_Question t3 = new Third_Question();
        t3.display();

        Third_Question t4 = new Third_Question();
        t4.display();

    }
}
