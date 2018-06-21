package be.kdg.programmeertalen.parsing;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;

import javax.xml.bind.*;
import java.io.File;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/17 11:18
 */
public class ProgrammeerTalenJaxbParser {

    public static void JaxbWriteXml(String file, Object root) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(root.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(root, new File(file));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static <T> T JaxbReadXml(String file, Class<T> typeParameterClass) {
        T multiklasse = null;
        try {
            JAXBContext context = JAXBContext.newInstance(typeParameterClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File f = new File(file);
            multiklasse = (T) unmarshaller.unmarshal(f);;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return multiklasse;
    }
}
