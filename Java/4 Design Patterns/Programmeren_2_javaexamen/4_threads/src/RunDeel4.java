import threads.StringListCallable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** Examen Programmeren 2 - Java
 * Januari 2017
 */
public class RunDeel4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> spellingWoorden = Arrays.asList("Alfa", "Bravo", "Charlie", "Delta", "Echo",
                "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima", "Mike",
                "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango",
                "Uniform", "Victor", "Wisky", "X-ray", "Yankee", "Zulu");
        List<String> euroLanden = Arrays.asList("Belgie", "Bulgarije", "Cyprus", "Denemarken", "Duitsland",
                "Estland", "Finland", "Frankrijk", "Griekenland", "Hongarije", "Ierland", "Italie",
                "Kroatie", "Letland", "Litouwen", "Luxemburg", "Malta", "Nederland", "Oostenrijk",
                "Polen", "Portugal", "Roemenie", "Slovenie", "Slowakijke", "Spanje", "Tsjechie",
                "Verenigd Koninkrijk", "Zweden");

        ExecutorService pool = Executors.newFixedThreadPool(2);
        //Opgave 4.2
        Future<String> future1 = pool.submit(new StringListCallable(spellingWoorden));
        Future<String> future2 = pool.submit(new StringListCallable(euroLanden));

        System.out.println("spellingwoorden: " );
        System.out.println(future1.get());
        System.out.println("eurolanden: " );
        System.out.println(future2.get());
        pool.shutdown();
    }
}
