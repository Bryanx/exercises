package stax;

import model.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StAXParserDemo {
    public static void main(String[] args) {
        boolean bFirstName = false;
        boolean bLastName = false;
        boolean bAge = false;

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader =
                    factory.createXMLEventReader(
                            new FileReader("simpsons2.xml"));

            List<Person> familyList = new ArrayList<>();

            Person person = null;
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                switch (event.getEventType()) {
                    case XMLStreamConstants.START_ELEMENT:
                        StartElement startElement = event.asStartElement();
                        String tagName = startElement.getName().getLocalPart();
                        if (tagName.equalsIgnoreCase("person")) {
                            System.out.println("Start Element : person");
                            Attribute rollNo = startElement.getAttributeByName(new QName("roll-no")); // Beter dit dan de 2 volgende regels
                            // Iterator<Attribute> attributes = startElement.getAttributes();
                            // String rollNo = attributes.next().getValue();
                            System.out.println("Roll No : " + rollNo.getValue());
                            person = new Person();
                        } else if (tagName.equalsIgnoreCase("firstname")) {
                            bFirstName = true;
                        } else if (tagName.equalsIgnoreCase("lastname")) {
                            bLastName = true;
                        } else if (tagName.equalsIgnoreCase("age")) {
                            bAge = true;
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        Characters characters = event.asCharacters();
                        if (bFirstName) {
                            System.out.println("First Name: " + characters.getData());
                            person.setFirstName(characters.getData());
                            bFirstName = false;
                        }
                        if (bLastName) {
                            System.out.println("Last Name: " + characters.getData());
                            person.setLastName(characters.getData());
                            bLastName = false;
                        }
                        if (bAge) {
                            System.out.println("Age: " + characters.getData());
                            person.setAge(Integer.parseInt(characters.getData()));
                            bAge = false;
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = event.asEndElement();
                        if (endElement.getName().getLocalPart().equalsIgnoreCase("person")) {
                            System.out.println("End Element : person");
                            familyList.add(person);
                            System.out.println();
                        }
                        break;
                }
            }
            System.out.println("Ingelezen data in list:");
            for (Person p : familyList) {
                System.out.println(p);
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}