package dom;


import model.Person;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParserDemo {
    private static final String file = "simpsonsdom.xml";

    public static void main(String[] args) {

        try {
            //document maken:
            Document doc = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().parse(new File(file));


            //Extract the root element
            Element rootElement = doc.getDocumentElement();
            System.out.println("Root element :" + rootElement.getNodeName());
            System.out.println("----------------------------");
            List<Person> familyList = new ArrayList<>();
            NodeList personNodes = rootElement.getChildNodes();
            for (int i = 0; i < personNodes.getLength(); i++) {
                if (personNodes.item(i).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                Element e = (Element) personNodes.item(i);
                System.out.println("\nCurrent Element :" + e.getNodeName());
                //Onderzoek attribuut:
                System.out.println("roll no : " + e.getAttribute("roll-no"));
                //onderzoek sub-elements:
                Element firstname = (Element) e.getElementsByTagName("firstname").item
                        (0);
                Element lastname = (Element) e.getElementsByTagName("lastname").item(0);
                Element age = (Element) e.getElementsByTagName("age").item(0);
                System.out.println("firstname: " + firstname.getTextContent());
                familyList.add(new Person(
                        firstname.getTextContent(),
                        lastname.getTextContent(),
                        Integer.parseInt(age.getTextContent())
                ));
            }
            System.out.println("\nInhoud van ArrayList:");
            familyList.forEach(System.out::println);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }
}