public class EvenThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    System.out.println("số chẵn " + i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");

    }

}
