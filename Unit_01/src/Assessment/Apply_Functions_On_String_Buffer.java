package Assessment;

public class Apply_Functions_On_String_Buffer {
    public static void main(String[]args)
    {
        StringBuffer s=new StringBuffer("Hello");
        System.out.println(s.append("java"));
        System.out.println(s.insert(1,"java"));
        System.out.println(s.replace(1,2,"java"));
        System.out.println(s.delete(1,3));
        System.out.println(s.reverse());
    }
}
