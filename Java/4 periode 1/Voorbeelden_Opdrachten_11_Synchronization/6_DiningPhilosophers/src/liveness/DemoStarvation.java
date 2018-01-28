package liveness;

/**
 * Mark Goovaerts
 * 18/11/2014
 */
public class DemoStarvation {
        public static void main(String[] args) {
            Chopstick[] chopsticks = new Chopstick[5]; // een array van 5 vorken
            Philosopher [] philosophers = new Philosopher[5]; // een array van 5 filosofen

            for (int i = 0; i < 5; i++) {
                chopsticks[i] = new Chopstick();
            }

            for (int i = 0; i < 5; i++) {
                //Elke filosoof krijgt 2 vorken mee (links en rechts):
                philosophers[i] = new Philosopher(chopsticks[i] , chopsticks[(i+1) % 5], i + "");
            }

            for (Philosopher philosopher : philosophers) {
                new Thread(philosopher).start();
            }
        }

    }




