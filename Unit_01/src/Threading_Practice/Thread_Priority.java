package Threading_Practice;

public class Thread_Priority {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        },"1st thread");
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        },"2nd Thread");
//        System.out.println(t1.getName()); //print Thread-0
//        System.out.println(t2.getName()); //print Thread-1

        t1.setPriority(1);
        t2.setPriority(5);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

//        System.out.println(t1.getPriority());//5
//        System.out.println(t2.getPriority());//5
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Exit///");
    }
}
