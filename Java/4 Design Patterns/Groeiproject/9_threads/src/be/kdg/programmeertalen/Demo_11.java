package be.kdg.programmeertalen;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.Stijl;
import be.kdg.programmeertalen.threading.ProgrammeerTaalCallable;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/17 11:03
 */
public class Demo_11 {

    public static final int TESTCOUNT = 100;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<List<ProgrammeerTaal>> call1 =
                new ProgrammeerTaalCallable(p -> p.getStijl() == Stijl.OBJECTORIENTED);
        Callable<List<ProgrammeerTaal>> call2 =
                new ProgrammeerTaalCallable(p -> p.getAantalGebruikers() > 500000);
        Callable<List<ProgrammeerTaal>> call3 =
                new ProgrammeerTaalCallable(p -> p.getOpgerichtIn().isAfter(LocalDate.of(1970, 1, 1)));
        ExecutorService e = Executors.newFixedThreadPool(3);

        long now = System.currentTimeMillis();
        for (int i = 0; i < TESTCOUNT; i++) {
            Future<List<ProgrammeerTaal>> future1 = e.submit(call1);
            Future<List<ProgrammeerTaal>> future2 = e.submit(call2);
            Future<List<ProgrammeerTaal>> future3 = e.submit(call3);

            List<ProgrammeerTaal> listOne = future1.get();
            List<ProgrammeerTaal> listTwo = future2.get();
            List<ProgrammeerTaal> listThree = future3.get();
        }
        double result = System.currentTimeMillis() - now;
        System.out.println(String.format(
                "3 Futures verzamelen elk 1000 talen (gemiddelde uit 100 runs): %.2f ms", result));

        e.shutdown();
    }
}
