package peer.todo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Bryan de Ridder
 * @version 1.0 07/12/2016 11:17
 */
public class TodoItem {
    private String titel;
    private LocalDate deadline;
    private boolean afgewerkt;

    public TodoItem(String titel, LocalDate deadline) {
        if (titel.length() <= 0) {
            throw new IllegalArgumentException("Verwacht type exceptie is gethrowd, alles ok dus: De titel mag niet leeg zijn");
        }
        if (deadline.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Verwacht type exceptie is gethrowd, alles ok dus: Deadline mag niet in het verleden\n" +
                    "liggen");
        }
        this.titel = titel;
        this.deadline = deadline;
        this.afgewerkt = false;
    }

    public void setDeadline(LocalDate deadline) {
        if (deadline.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Verwacht type exceptie is gethrowd, alles ok dus: Deadline mag niet in het verleden\n" +
                    "liggen!");
        }
        this.deadline = deadline;
    }

    public boolean isAfgewerkt() {
        return afgewerkt;
    }

    public void setAfgewerkt(boolean afgewerkt) {
        this.afgewerkt = afgewerkt;
    }

    @Override
    public String toString() {
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(now, deadline);
        long months = ChronoUnit.MONTHS.between(now, deadline);
        long years = ChronoUnit.YEARS.between(now, deadline);

        if (!this.isAfgewerkt()) {
            return String.format("%-30s %-15s Nog %d jaar, %d maand(en), %d dag(en)",
                    this.titel,
                    this.deadline,
                    years, months, days);
        }
        return String.format("%-30s %-15s Klaar!",
                this.titel,
                this.deadline.toString());

    }
}
