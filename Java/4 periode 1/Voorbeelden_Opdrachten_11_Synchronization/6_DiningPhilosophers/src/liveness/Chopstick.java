package liveness;

public class Chopstick {
    private boolean taken = false;

    public synchronized boolean pickUp(){
        if (!taken) {
            taken = true;
            return true;
        }
        else return false;

    }

    public synchronized void putDown(){
        taken = false;
    }
}