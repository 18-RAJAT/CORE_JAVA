package Exception_Handling_practice;

public class Create_our_own_Exception {
    public static void main(String[]args)
    {
        int a=10;
        int b=11;
        try {
            int res=a/b;

            if(res==0)
                throw new RajatException("Not possible");
            System.out.println(res);
        } catch (RajatException e) {
            System.out.println("Sol " + e.getMessage());
        }
    }
}
