package be.kdg.menu;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/2016 13:42
 */
public class Menu {

    private int invoer;
    private StudentManager StudentManager = new StudentManager();

    public void toon() {
        while (true) {
            Scanner key = new Scanner(System.in);
            System.out.print("============== Menu ============== \n" +
                    "================================== \n" +
                    "1. Geef het bestand (.csv) \n" +
                    "2. Toon alfabetisch \n" +
                    "3. Toon op geboorte datum \n" +
                    "4. Toon de jarigen van deze maand \n" +
                    "5. Geef een lijst van dorpen \n" +
                    "6. Geef de namen per dorp \n" +
                    "7. Verwijder Student \n" +
                    "8. Verwijder Dorp \n" +
                    "9. Exit \n" +
                    "================================== \n" +
                    "Geef uw keuze --> ");
            try {
                this.invoer = key.nextInt();
                switch (invoer) {
                    case 1:StudentManager.laadBestand();break;
                    case 2:StudentManager.toonOpNaam();break;
                    case 3:StudentManager.toonOpLeeftijd();break;
                    case 4:StudentManager.toonJarigen();break;
                    case 5:StudentManager.toonWoonplaatsen();break;
                    case 6:StudentManager.toonWoonplaats();break;
                    case 7:StudentManager.deleteStudent();break;
                    case 8:StudentManager.deleteHome();break;
                    case 9:return;
                    default:System.out.println("Geef een getal tussen 1 en 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Geef een cijfer aub.");
            }
        }
    }
}
