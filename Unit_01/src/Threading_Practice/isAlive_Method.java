package Threading_Practice;
//IsAlive is determine your thread is running state or not...!!
public class isAlive_Method {
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
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Exit///");
    }
}
