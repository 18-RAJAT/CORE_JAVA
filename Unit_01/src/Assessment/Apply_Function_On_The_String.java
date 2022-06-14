package Assessment;

public class Apply_Function_On_The_String {
    public static void main(String[]args)
    {
        String s="Java";
        System.out.println(s.concat(" Hello"));//Doesn't change original string
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a',s.indexOf('a')+1));
        System.out.println(s.equals("JAVA"));
        System.out.println(s.equalsIgnoreCase("JAVA"));
        System.out.println(s.lastIndexOf('a'));

    }
}
