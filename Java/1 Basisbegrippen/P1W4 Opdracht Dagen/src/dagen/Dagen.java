package dagen;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 11:39
 */
public class Dagen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        GregorianCalendar kalender = new GregorianCalendar();
        int geboortedatum;
        System.out.println(kalender.getTime());
        System.out.println(kalender.isLeapYear(2014));

        System.out.println("Geef je geboortedatum in de vorm (jjjj mm dd): ");
        geboortedatum = keyboard.nextInt();




    }
}
