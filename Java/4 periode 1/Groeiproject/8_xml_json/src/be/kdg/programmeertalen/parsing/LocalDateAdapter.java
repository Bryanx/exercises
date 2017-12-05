package be.kdg.programmeertalen.parsing;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/17 11:16
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    public LocalDate unmarshal(String myString) throws Exception {
        return LocalDate.parse(myString, DateTimeFormatter.ISO_DATE);
    }

    public String marshal(LocalDate myDate) throws Exception {
        return myDate.toString();
    }

}
