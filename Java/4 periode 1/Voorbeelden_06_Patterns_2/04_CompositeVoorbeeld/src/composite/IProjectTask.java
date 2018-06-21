package composite;

import java.time.LocalDate;

/**
 * De leaf-klasse IProjectTask implementeert de gemeenschappelijke interface IProjectComponent
 */
public class IProjectTask implements IProjectComponent {
    private String responsible;
    private String description;
    private LocalDate start;
    private int hours;

    public IProjectTask(String responsible, String description, LocalDate start, int hours) {
        this.responsible = responsible;
        this.description = description;
        this.start = start;
        this.hours = hours;
    }

    public int getTime() {
        return hours;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) --> %d hrs", description, responsible, hours);
    }
}
