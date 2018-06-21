package stax;

import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;
import model.Person;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class StAXCreateXMLDemo {
    public static void main(String[] args) {
        //Testdata:
        List<Person> familyList = Arrays.asList(
                new Person("Homer", "Simpson", 45),
                new Person("Marge", "Simpson", 42),
                new Person("Bart", "Simpson", 10),
                new Person("Lisa", "Simpson", 8),
                new Person("Maggie", "Simpson", 1)
        );
        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xmlStreamWriter = new IndentingXMLStreamWriter(xmlOutputFactory.createXMLStreamWriter
                    (new FileWriter("simpsons2.xml")));

            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("family");

            int count = 1;
            for (Person person : familyList) {
                xmlStreamWriter.writeStartElement("person");
                //attribuut toevoegen:
                xmlStreamWriter.writeAttribute("roll-no", String.valueOf(count++));
                //content toevoegen:
                writeSimpleElement(xmlStreamWriter, "firstname", person.getFirstName());

                writeSimpleElement(xmlStreamWriter, "lastname", person.getLastName());

                writeSimpleElement(xmlStreamWriter, "age", String.valueOf(person.getAge()));

                xmlStreamWriter.writeEndElement(); // </person>
            }

            xmlStreamWriter.writeEndElement(); // </family>
            xmlStreamWriter.writeEndDocument();

            xmlStreamWriter.close();

            System.out.println("File saved!");
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeSimpleElement(XMLStreamWriter xmlStreamWriter, String naam, String inhoud) throws XMLStreamException {
        xmlStreamWriter.writeStartElement(naam);
        xmlStreamWriter.writeCharacters(inhoud);
        xmlStreamWriter.writeEndElement();
    }
}

