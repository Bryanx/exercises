package versie_3;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 16:34
 */
public class ChatBot {
    //ATTRIBUTEN
    private int teller;
    private String naam;
    private Random random;
    private String[] zoekwoorden = {"aanloggen", "traag", "scherm", "hangt", "kleuren", "trager", "geluid",
            "vooruit", "niet", "gisteren", "weekend", "geen idee", "oplossing",
            "geen", "zeker"};
    private String[] antwoorden = {"Ok, probeer eerst al eens te herstarten",
            "Kan je het probleem eens herformuleren?",
            "En is dat al lang zo?",
            "Waarom heb je ons niet eerder gecontacteerd?",
            "Ik denk dat je dat zelf wel kan oplossen, niet?",
            "Die vraag heb ik nog niet vaak gehad!",
            "Sorry, ik was even bezig, kan je de vraag eens herhalen?",
            "Aha, gekend probleem, ik zoek het op en laat je iets weten.",
            "Sorry, daar heb ik niet direct een antwoord op. Wat nu?",
            "En dan?",
            "Dat zal wel, maar er zijn ergere dingen he.",
            "Hmm, die moet ik opzoeken. En wanneer deed dat zich juist voor?"};
    private String[] overeenkomstigAntwoord = {"Probeer opnieuw aan te loggen, lost dat je probleem op?",
            "Herstarten van het systeem kan vele snelheidsproblemen oplossen. Heb je dat al geprobeerd?",
            "Misschien is er iets mis met de video adapter?",
            "Je kan best nog even wachten, mogelijk lost het probleem zichzelf op.",
            "Heb je onlangs nieuwe videosoftware geïnstalleerd?",
            "Is er nog voldoende ruimte vrij op het toestel?",
            "Het volume staat toch juist he?",
            "Mogelijk een probleem met één van de systeemdrivers.",
            "Pas op, soms wel hoor.",
            "En eergisteren?",
            "In de week werken die dingen meestal vlotter...",
            "Niet wanhopen, we vinden samen wel een oplossing.",
            "Ik zal het wel oplossen, geef jij mij gewoon wat meer info.",
            "Echt geen?",
            "Ik ken dat 'zeker', uiteindelijk blijkt het toch niet!"};

    //CONSTRUCTORS
    public ChatBot(String naam) {
        this.naam = naam;
        this.random = new Random();
    }

    //METHODS
    public String antwoordOpVraag(String vraag) {
        this.teller++;
        String typisch = "Zucht, typisch. ";

        if (vraag.equals("stop")) {
            return "\"Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van\n" +
                    "Veronica\"";
        } else if (vraag.length() < 4) {
            return null;
        } else {
            for (int j = 0; j < zoekwoorden.length; j++) {
                if (vraag.contains(zoekwoorden[j])) {
                    if (teller > 5) {
                        return typisch + overeenkomstigAntwoord[j];
                    } else {
                        return overeenkomstigAntwoord[j];
                    }
                }
                if (teller > 5) {
                    return typisch + antwoorden[random.nextInt(antwoorden.length)];
                }
            }
            return antwoorden[random.nextInt(antwoorden.length)];

        }
    }

    @Override
    public String toString() {
        return "Hallo, ik ben chatbot Veronica, stel me een vraag en ik geef je een oplossing!\n" +
                "Tik \"stop\" om te eindigen";
    }

}
