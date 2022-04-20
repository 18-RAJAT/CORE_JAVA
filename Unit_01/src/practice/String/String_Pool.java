/*
* -Three ways to created the string pool
*
*
*
* 1.Using String Literal -> String <variable name> = “<value of string>”;
*
*
*
* 2.Using new keyword -> String <variable name> = new String(“<value of the string>”);
*
*
*
* 3.Using String.intern()
* 1st way -> <String name>.intern();
* 2nd way -> String <variable name> = new String(<"string value">).intern();
 * */

package practice.String;

public class String_Pool {
    public static void main(String[]args)
    {
        String str1 = "Java";
        String str2 = "Python";

        String str3 = new String("Golang");
        String str4 = new String("Docker");

        String str5 = new String("javascript").intern();
        String str6 = new String("React").intern();

        System.out.println(str1 == str3);
        System.out.println(str5 == str2);
        System.out.println(str4 == str6);

    }
}