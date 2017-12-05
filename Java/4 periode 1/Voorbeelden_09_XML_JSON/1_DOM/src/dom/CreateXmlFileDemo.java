package dom;

import model.Person;
import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.Arrays;
import java.util.List;


public class CreateXmlFileDemo {

    private static final String file = "simpsonsdom.xml";

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
            //document maken:
            Document doc = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().newDocument();
            //root element maken:
            Element rootElement = doc.createElement("family");
            doc.appendChild(rootElement);
            //person elementen toevoegen:
            int count = 1;
            for (Person person : familyList) {
                Element personElement = doc.createElement("person");
                //attribuut toevoegen:
                personElement.setAttribute("roll-no", String.valueOf(count++));

                //content toevoegen:
                Element firstnameElement = doc.createElement("firstname");
                firstnameElement.setTextContent(person.getFirstName());
                personElement.appendChild(firstnameElement);

                //content toevoegen:
                Element lastnameElement = doc.createElement("lastname");
                lastnameElement.setTextContent(person.getLastName());
                personElement.appendChild(lastnameElement);

                //content toevoegen:
                Element ageElement = doc.createElement("age");
                ageElement.setTextContent(String.valueOf(person.getAge()));
                personElement.appendChild(ageElement);

                rootElement.appendChild(personElement);
            }
            // source voor wegschrijven
            DOMSource src = new DOMSource(doc);
            // schrijver
            Transformer xf = TransformerFactory.newInstance().newTransformer();
            // pretty print
            xf.setOutputProperty(OutputKeys.INDENT, "yes");
            xf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            // display xml:
            xf.transform(src, new StreamResult(System.out));
            //save file
            xf.transform(src, new StreamResult(new File(file)));
            System.out.println("File Saved!");
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}

