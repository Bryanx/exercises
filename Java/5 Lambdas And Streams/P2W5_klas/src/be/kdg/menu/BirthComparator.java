package be.kdg.menu;

import java.util.Comparator;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/2016 15:38
 */
public class BirthComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGeboorteDatum().isBefore(student2.getGeboorteDatum())) {
            return -1;
        } else if (student1.getGeboorteDatum().isAfter(student2.getGeboorteDatum())) {
            return 1;
        }
        return 0;
    }
}
