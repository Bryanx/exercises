package modelGeenAnnotaties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * http://examples.javacodegeeks.com/core-java/xml/bind/jaxb-marshal-example/
 */

@XmlRootElement
public class Museums {
    private List<Museum> museumList = new ArrayList<>();

    public void setMuseumList(List<Museum> museumList) {
        this.museumList = museumList;
    }

    public List<Museum> getMuseumList() {
        return museumList;
    }

    public void add(Museum museum) {
        this.museumList.add(museum);
    }
}
