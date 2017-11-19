package be.kdg.demo;

import be.kdg.demo.singleton.Controller;
import be.kdg.demo.singleton.Film;

/**
 * Probleemstelling:
 * 
 * Stel dat je een gewone klasse hebt die je niet mag of kunt
 * wijzigen. Toch wil je het singleton pattern toepassen omdat er in    
 * bepaalde situaties maar één object van die klasse mag zijn.
 * Hoe zou je dat aanpakken?
 *
 * Laat het programma runnen en bekijk de uitvoer.
 * Zorg er dan voor dat je de verwachte uitvoer bekomt door het
 * maken van een extra klasse UniekeVerzameling waarin je ervoor 
 * zorgt dat er slechts 1 instantie van de klasse Verzameling kan 
 * zijn. Verder is er ook nog een kleine aanpassing in de klasse
 * Controller noodzakelijk.
 */
public class RunDemo {
   public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("Verzameling:");
        for (Film film : controller.getGesorteerdeLijst()) {
            System.out.println(film);
        }

        System.out.println("\nAndere verzameling:");
        for (Film film : controller.getGesorteerdeAndereLijst()) {
            System.out.println(film);
        }
    }
}

// Actuele uitvoer;
/*
Verzameling:
Film{titel='Psycho', jaar=1960}
Film{titel='Psycho', jaar=1998}
Film{titel='Taxi Driver', jaar=1976}

Andere verzameling:
Film{titel='Joyride', jaar=1996}
Film{titel='Joyride', jaar=2001}
Film{titel='Vanishing Point', jaar=1971}
Film{titel='Vanishing Point', jaar=1997}
*/

// Verwachte uitvoer:
/*
Verzameling:
Film{titel='Joyride', jaar=1996}
Film{titel='Joyride', jaar=2001}
Film{titel='Psycho', jaar=1960}
Film{titel='Psycho', jaar=1998}
Film{titel='Taxi Driver', jaar=1976}
Film{titel='Vanishing Point', jaar=1971}
Film{titel='Vanishing Point', jaar=1997}

Andere verzameling:
Film{titel='Joyride', jaar=1996}
Film{titel='Joyride', jaar=2001}
Film{titel='Psycho', jaar=1960}
Film{titel='Psycho', jaar=1998}
Film{titel='Taxi Driver', jaar=1976}
Film{titel='Vanishing Point', jaar=1971}
Film{titel='Vanishing Point', jaar=1997}
*/