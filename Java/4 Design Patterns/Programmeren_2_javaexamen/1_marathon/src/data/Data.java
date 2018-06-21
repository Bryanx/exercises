package data;

import marathon.MarathonLoper;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/** Examen Programmeren 2 - Java
 * Januari 2017
 * IN DEZE KLASSE MAG JE NIETS WIJZIGEN!
 */
public class Data {
    private static MarathonLoper[] lopersArray = {
            new MarathonLoper("Biwott Stanley", "Kenia", LocalDate.of(2016, 1, 3), 7432),
            new MarathonLoper("Gebrselassie Haile", "Ethiopie", LocalDate.of(2008, 12, 4), 7439),
            new MarathonLoper("Mutai Emmanuel", "Kenia", LocalDate.of(2014, 12, 23), 7393),
            new MarathonLoper("Kimetto Dennis", "Kenia", LocalDate.of(2014, 12, 23), 7377),
            new MarathonLoper("Noguchi Mizuki", "Japan", LocalDate.of(2012, 12, 10), 8352),
            new MarathonLoper("Kipsang Wilson", "Kenia", LocalDate.of(2016, 1, 3), 7403),
            new MarathonLoper("Makau Patrick", "Kenia", LocalDate.of(2011, 6, 8), 7418),
            new MarathonLoper("Kipchoge Eliud", "Kenia", LocalDate.of(2016, 2, 13), 7384),
            new MarathonLoper("Bekele Kenenisa", "Ethiopie", LocalDate.of(2016, 1, 3), 7383),
            new MarathonLoper("Radcliffe Paula", "Groot-Brittanie", LocalDate.of(2003, 2, 5), 8125),
            new MarathonLoper("Keitany Mary", "Ethiopie", LocalDate.of(2012, 12, 10), 8317),
    };

    public static List<MarathonLoper> getList() {
        return Arrays.asList(lopersArray);
    }
}
