package JAVA_EXAM;

//pen class  features refil and color and name

abstract class pen
{
    abstract void refil();
    abstract void color();
    abstract void name();
}
class mon extends pen
{
    void refil() {
        System.out.println("Blank");
    }
    void color()
    {
        System.out.println("Blue");
    }
    void name()
    {
        System.out.println("Linc");
    }
}

public class Abstract_and_interface
{
    public static void main(String[]args)
    {
        mon obj=new mon();
        obj.refil();
        obj.color();
        obj.name();
    }
}
