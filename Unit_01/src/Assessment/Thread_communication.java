package Assessment;

class customer
{
    int bal=1000;
    public synchronized void withdraw(int amt)
    {
        System.out.println("going to withdraw");
        if(this.bal<amt)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        this.bal -=amt;
        System.out.println("final balance after withdrawal "+bal);
    }
    public synchronized void deposit(int amt)
    {
        System.out.println("going to deposit");
        this.bal +=amt;
        System.out.println("final balance after deposit "+bal);
        notify();
    }
}

class thread1 extends Thread
{
    customer c;
    thread1(customer c)
    {
        this.c=c;
    }
    public void run()
    {
        c.withdraw(1500);
    }
}

class thread2 extends Thread
{
    customer c;
    thread2(customer c)
    {
        this.c=c;
    }
    public void run()
    {
        c.deposit(1000);
    }
}

class demo
{
    public static void main(String args[])
    {
        customer c = new customer();
        thread1 t1 = new thread1(c);
        t1.start();
        thread2 t2 = new thread2(c);
        t2.start();
    }
}








