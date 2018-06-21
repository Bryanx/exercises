package perfect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerfectGetalRunnable implements Runnable {
    private List<Integer> getallen;
    private int begin;
    private int einde;
    private static List<Integer> perfecteGetallen;

    public PerfectGetalRunnable(List<Integer> getallen, int begin, int einde){
        this.getallen = getallen;
        this.begin = begin;
        this.einde = einde;
        perfecteGetallen = new ArrayList<>();
    }

    public void run() {
        System.out.print(".");
        for(int i = begin; i <= einde; i++) {
            if(isPerfect(getallen.get(i))){
                perfecteGetallen.add(getallen.get(i));
            }
        }
    }

    private boolean isPerfect(int getal) {
        if(getal == 1) return false;
        int somFactoren = 1;

        for (int i = 2; i <= getal / 2; i++) {
            if (getal % i == 0) {
                somFactoren += i;
            }
            Thread.yield();
        }
        return(somFactoren == getal);
    }

    public static List<Integer> getPerfecteGetallen() {
        return Collections.unmodifiableList(perfecteGetallen);
    }
}

