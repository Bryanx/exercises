package validation;

import model.Customer;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.util.ValidationEventCollector;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

/**
 * Voorbeeld: http://blog.bdoughan.com/2010/12/jaxb-and-marshalunmarshal-schema.html
 * We maken gebruik van een XML schema: customer.xsd om het xml bestand input.txt te valideren.
 * Volgens het XML schema gelden volgende restricties:
 * - The customer's name cannot be longer than 5 characters.
 * - The customer cannot have more than 2 phone numbers.
 * <p>
 * Vandaar dat de ValidationEventHandler daarover informatie verzamelt en afdrukt.
 */
public class UnmarshalDemo {
    public static void main(String[] args) throws Exception {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("customer.xsd"));

        JAXBContext context = JAXBContext.newInstance(Customer.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        unmarshaller.setSchema(schema);
        unmarshaller.setEventHandler(event -> {
            System.out.println("\nEVENT");
            System.out.println("SEVERITY:  " + event.getSeverity());
            System.out.println("MESSAGE:  " + event.getMessage());
            System.out.println("LINKED EXCEPTION:  " + event.getLinkedException());
            System.out.println("LOCATOR");
            System.out.println("    LINE NUMBER:  " + event.getLocator().getLineNumber());
            System.out.println("    COLUMN NUMBER:  " + event.getLocator().getColumnNumber());
            System.out.println("    OFFSET:  " + event.getLocator().getOffset());
            System.out.println("    OBJECT:  " + event.getLocator().getObject());
            System.out.println("    NODE:  " + event.getLocator().getNode());
            System.out.println("    URL:  " + event.getLocator().getURL());
            return true;
        });

        Customer customer = (Customer) unmarshaller.unmarshal(new File("input.xml"));
        System.out.println("\n" + customer);
    }
}
