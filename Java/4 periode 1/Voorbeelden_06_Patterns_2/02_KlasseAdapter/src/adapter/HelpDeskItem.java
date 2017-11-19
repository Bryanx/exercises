package adapter;

import java.time.LocalDateTime;

public class HelpDeskItem {
    private LocalDateTime localDateTime;
    private int priority;
    private String description;

    public HelpDeskItem(String description) {
        this.localDateTime = LocalDateTime.now();
        this.priority = 1; //normal priority
        this.description = description;
    }

    public HelpDeskItem(int priority, String description) {
        this.localDateTime = LocalDateTime.now();
        this.priority = priority;
        this.description = description;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%-10s: %2d %s", localDateTime, priority, description);
    }
}
