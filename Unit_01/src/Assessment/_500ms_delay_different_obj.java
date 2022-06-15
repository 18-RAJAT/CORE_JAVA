package Assessment;

class  Display {
//    public class _500ms_delay_different_obj {
        public synchronized void xyz(String name) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(name);
        }
    }

    class myThread extends Thread {
        Display d;
        String name;

        myThread(Display d, String name) {
            this.d = d;
            this.name = name;
        }
        public void run() {
            d.xyz(name);
        }
    }

    class another {
        public static void main(String[] args) {
            Display d = new Display();
            myThread t1 = new myThread(d, "Rajat");
            t1.start();

            myThread t2 = new myThread(d, "Joshi");
            t2.start();

            myThread t3 = new myThread(d, "CSE");
            t3.start();
        }
}