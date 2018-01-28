package be.kdg;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/12/17 21:11
 */
public class DubbelTellen {

    public static final Object LOCK = new Object();

    public static void main(String[] args) {
        Runnable teller1 = () -> {
            synchronized (LOCK) {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(i + " ");
                }
            }
        };

        Runnable teller2 = () -> {
            synchronized (LOCK) {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(i + " ");
                }
            }
        };

        Thread een = new Thread(teller1, "een");
        Thread twee = new Thread(teller2, "twee");

        een.start();
        twee.start();
    }
}
