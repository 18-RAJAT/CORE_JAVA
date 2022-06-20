package JAVA_EXAM;

class Table{
    synchronized void printTable(int n){
        for(int i=0;i<=100;i++){
            System.out.println(n+i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
class MyThread3 extends Thread{
    Table t;
    MyThread3(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
class MyThread4 extends Thread{
    Table t;
    MyThread4(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
class MyThread5 extends Thread{
    Table t;
    MyThread5(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class Synchronization{
    public static void main(String args[]) throws InterruptedException {
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        MyThread3 t3=new MyThread3(obj);
        MyThread4 t4=new MyThread4(obj);
        MyThread5 t5=new MyThread5(obj);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();
//        t5.join();
    }
}  