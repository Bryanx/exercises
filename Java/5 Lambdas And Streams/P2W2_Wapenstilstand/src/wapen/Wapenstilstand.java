package wapen;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 22:10
 */
public class Wapenstilstand {
    public static void main(String[] args) {
        System.out.println("Wapenstilstand was on a " + LocalDate.of(1918,11,11).getDayOfWeek().toString().toLowerCase());
        for (int i = 1980; i <= 2040; i++) {
            LocalDate wapenStilStand = LocalDate.of(i,11,11);
            if (wapenStilStand.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            System.out.print(wapenStilStand.getYear() + " ");}
        }
    }
}
