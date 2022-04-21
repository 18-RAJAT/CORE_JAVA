package practice.OOPS.Class_Object;

public class Accounting_System {

    private static Accounting_System a;
    int accountNo;
    String name;
    float ammount;

    void insert(int a,String b,float c)
    {
        accountNo = a;
        name = b;
        ammount = c;
    }
    //Deposit method
    void Deposit(float c)
    {
        ammount = ammount + c;
        System.out.println(c);
    }

    //Withdraw method

    void Withdraw(float c)
    {
        if(ammount < c)
        {
            System.out.println("Insufficient balance");
        }
        else
        ammount = ammount - c;
        {
            System.out.println(c + "Withdrown");
        }
    }

    //Check balance
    void checkBalance()
    {
        System.out.println("Ammount is : " + ammount);
    }

    void display()
    {
        System.out.println(accountNo + " " + name + " " + ammount);
    }

    public static void main(String[]args)
    {
        Accounting_System.a = new Accounting_System();
        a.insert(832345,"John",1000);
        a.display();
        a.checkBalance();
        a.Deposit(40000);
        a.checkBalance();
        a.Withdraw(15000);
        a.checkBalance();

    }

}
