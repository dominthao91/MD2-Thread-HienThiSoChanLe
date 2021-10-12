public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread =new OddThread();
        EvenThread  evenThread=new EvenThread();
        Thread t1 =new Thread(oddThread);
        Thread t2 =new Thread(evenThread);
        t1.start();
        t2.start();
    }
}
