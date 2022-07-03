package Questions;

class Garbage_collector {
    public void finalize(){System.out.println("Garbage collection");}
    public static void main(String []args)
    {
        Garbage_collector s1=new Garbage_collector();
        Garbage_collector s2=new Garbage_collector();

        s1=null;s2=null;
        System.gc();
    }
}
