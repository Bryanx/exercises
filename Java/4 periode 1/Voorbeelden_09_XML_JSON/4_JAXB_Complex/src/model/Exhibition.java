package model;

import adapter.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

/**
 * http://examples.javacodegeeks.com/core-java/xml/bind/jaxb-marshal-example/
 */

@XmlType(propOrder = {"name", "artists", "from", "to"})
public class Exhibition {
    private String name;
    private LocalDate from;
    private LocalDate to;
    private List<String> artists;

    public Exhibition() {
    }

    public Exhibition(
            String name,
            LocalDate from,
            LocalDate to,
            List<String> artists
    ) {

        this.name = name;
        this.from = from;
        this.to = to;
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFrom() {
        return from;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    /*
     * indicates JaxB what adapter it should use to manage this field
     */
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setTo(LocalDate to) {
        this.to = to;
    }

    public List<String> getArtists() {
        return artists;
    }

    @XmlElement(name = "artist")
    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Exhibition{" +
                "artists=" + artists +
                ", name='" + name + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
