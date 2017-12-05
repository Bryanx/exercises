package be.kdg.generate;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> generator = () -> random.nextInt(900) + 100;

        List<Integer> getallen = Stream.generate(() -> random.nextInt(900) + 100)
                    .limit(100)
                    .sorted()
                    .collect(Collectors.toList());

        int[] count = {0}; // Must be effectively final
        // Je kunt hier geen gewone int als teller gebruiker!
        getallen.forEach(e -> {
            System.out.print(e + " ");
            if (++count[0] % 10 == 0) System.out.println();
        });
    }
}

/*
104 121 131 132 142 156 157 198 219 225
227 227 237 241 249 253 257 275 289 299
301 313 323 326 364 368 381 382 385 385
389 392 409 414 427 429 430 437 449 450
454 475 476 478 483 497 518 527 528 536
543 546 552 554 557 600 601 603 604 606
609 611 635 635 646 659 659 661 662 663
669 676 694 713 715 733 743 751 757 777
782 801 828 829 835 835 847 857 885 885
897 897 912 927 945 948 984 986 998 999
 */