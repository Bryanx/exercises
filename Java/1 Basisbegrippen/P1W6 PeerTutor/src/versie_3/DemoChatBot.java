package versie_3;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 16:44
 */
public class DemoChatBot {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot("greg");
        System.out.println(bot);

        while(true) {
            String vraag = "";
            Scanner keyboard = new Scanner(System.in);
            vraag = keyboard.nextLine();
            System.out.println(bot.antwoordOpVraag(vraag));
        }
    }
}
