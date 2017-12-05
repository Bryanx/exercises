import model.Museum;
import model.Museums;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Mark Goovaerts
 * 12/11/2015
 */
public class DemoReadComplexListOfMuseums {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Museums.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File file = new File("museums.xml");
            Museums museums = (Museums) unmarshaller.unmarshal(file);

            museums.getMuseumList().forEach(System.out::println);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}

