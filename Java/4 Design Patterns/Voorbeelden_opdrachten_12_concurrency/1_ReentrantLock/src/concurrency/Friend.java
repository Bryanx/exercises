package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Friend {
        private final String name;

        private final Lock lock = new ReentrantLock();

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public boolean impendingBow(Friend other) {
            Boolean myLock = false;
            Boolean yourLock = false;
            try {
                myLock = this.lock.tryLock(); // true als de blokkering lukt
                yourLock = other.lock.tryLock();
            } finally {
                if (!myLock || !yourLock) {   // als één van beide niet geblokkeerd
                    if (myLock) {
                        this.lock.unlock(); // lock terug vrijgeven
                    }
                    if (yourLock) {
                        other.lock.unlock(); // lock terug vrijgeven
                    }
                }
            }
            return myLock && yourLock;
        }

        public void bow(Friend other) {
            if (impendingBow(other)) {  // als beide gelocked (dus we kunnen buigen)
                try {
                    System.out.format("%s: %s has bowed to me!%n", this.name, other.getName());
                    other.bowBack(this);
                } finally {
                    this.lock.unlock();
                    other.lock.unlock();
                }
            } else {   // als één van beide (of beide) niet gelocked zijn (buigen kan niet - anders deadlock)
                System.out.format("%s: %s started to bow to me, but" +
                        " saw that I was already bowing to him.%n", this.name, other.getName());
            }
        }

        public void bowBack(Friend other) {
            System.out.format("%s: %s has bowed back to me!%n", this.name, other.getName());
        }
    }
