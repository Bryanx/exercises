package versie_1;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 16:44
 */
public class DemoChatBot1 {
    public static void main(String[] args) {
        ChatBot1 bot = new ChatBot1("greg");
        System.out.println(bot);

        while(true) {
            String vraag = "";
            Scanner keyboard = new Scanner(System.in);
            vraag = keyboard.next();
            System.out.println(bot.antwoordOpVraag(vraag));
        }
    }
}
