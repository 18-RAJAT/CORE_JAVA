package JAVA_EXAM;

//pen
interface shop
{
    void run();
}

class anotherPen implements shop
{
  public void run()
  {
      System.out.println("Pen");
  }
}
public class Interface {
    public static void main(String[]args)
    {
        anotherPen obj=new anotherPen();

        obj.run();
    }
}
