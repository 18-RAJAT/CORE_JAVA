package JAVA_EXAM;//package JAVA_EXAM;
//
////pen
//interface shop
//{
//    void run();
//}
//
//class anotherPen implements shop
//{
//  public void run()
//  {
//      System.out.println("Pen");
//  }
//}
//public class Interface {
//    public static void main(String[]args)
//    {
//        anotherPen obj=new anotherPen();
//
//        obj.run();
//    }
//}


interface Bank{
    float rateOfInterest();
}
class SBI implements Bank{
    public float rateOfInterest(){return 9.15f;}
}
class PNB implements Bank{
    public float rateOfInterest(){return 9.7f;}
}
class TestInterface2{
    public static void main(String[] args){
         SBI b=new SBI();
        PNB c=new PNB();

        System.out.println("ROI: "+b.rateOfInterest());
        System.out.println("PNB: "+c.rateOfInterest());
    }}