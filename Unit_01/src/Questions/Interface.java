package Questions;


interface In1
        {
            void display(int n);
        }

class test implements In1{

    @Override
    public void display(int n) {
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++)
            {
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
}
class abcd
{
    public static void main(String[]args) {
        test t1 = new test();
        t1.display(4);
    }
}
