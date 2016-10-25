package perfectgetal;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/10/2016 23:21
 */
public class PerfectGetal {

    public String isPerfect(int number) {

        int sum = 0;
        StringBuilder divisors = new StringBuilder();

        // if the number divided by something has no remainder -> divisor of the number:
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
                divisors.append(i + " ");
            }
        }

        // if the sum of all divisors == number -> Perfectnumber.
        if (sum == number) {
            return String.format("%d --> %s", number, divisors);
        } else {
            return null;
        }
    }
}
