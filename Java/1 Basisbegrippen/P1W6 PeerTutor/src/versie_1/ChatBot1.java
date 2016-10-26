package versie_1;

import java.util.Random;
import java.util.jar.Pack200;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 16:34
 */
public class ChatBot1 {
    //ATTRIBUTEN
    private String naam;
    private Random random;
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

    //CONSTRUCTORS
    public ChatBot1(String naam) {
        this.naam = naam;
        this.random = new Random();
    }

    //METHODS
    public String antwoordOpVraag(String vraag) {
        if (vraag.equals("stop")) {
            return "\"Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van\n" +
                    "Veronica\"";
        } else if (vraag.length() < 4) {
            return null;
        } else {
            return antwoorden[random.nextInt(antwoorden.length)];
        }
    }

    @Override
    public String toString() {
        return "Hallo, ik ben chatbot Veronica, stel me een vraag en ik geef je een oplossing!\n" +
                "Tik \"stop\" om te eindigen";
    }

}
