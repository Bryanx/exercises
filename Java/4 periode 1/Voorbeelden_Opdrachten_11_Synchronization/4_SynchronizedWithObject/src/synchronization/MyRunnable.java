package synchronization;

public class MyRunnable implements Runnable {
    private MyClass myClass;
    public static final Object LOCK = new Object();

    public MyRunnable(MyClass myClass) {
        this.myClass = myClass;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (LOCK) {
                myClass.setNumber(myClass.getNumber() + 1);
            }
        }
    }
}
