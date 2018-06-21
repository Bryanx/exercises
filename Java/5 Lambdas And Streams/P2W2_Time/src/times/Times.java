package times;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/11/2016 10:35
 */
public class Times {
    public static void main(String[] args) {
        Instant nu = Instant.now();
        LocalDate datum = LocalDate.now();
        System.out.println(nu);
        System.out.println(nu.getEpochSecond());

        for (int i = 2016; i < 2116; i++) {
            LocalDate aDate = LocalDate.of(i, 1, 1);
            if (aDate.isLeapYear()) {
                System.out.println(aDate);
            }
        }

        LocalDate geboorte = LocalDate.of(1991, 7, 15);
        LocalDate now = LocalDate.of(2016, 11, 23);

        long dagen = ChronoUnit.DAYS.between(geboorte, now);
        System.out.println("Ik ben " + dagen + " dagen oud.");

        System.out.println("Ik ben geboren op " + geboorte.getDayOfWeek());

        System.out.println("Ik ben geboren op " +
                geboorte.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));
    }
}
