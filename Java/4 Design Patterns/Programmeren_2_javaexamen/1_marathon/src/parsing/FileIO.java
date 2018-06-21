package parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import marathon.MarathonLoper;
import org.w3c.dom.Document;
import org.jdom2.JDOMException;
import org.w3c.dom.Element;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/** Examen Programmeren 2 - Java
 * Januari 2017
 * NAAM: Bryan de Ridder
 * KLASGROEP: INF203A
 */
public class FileIO {

    public static List<MarathonLoper> jdomReadXml(String fileName) {
        List<MarathonLoper> myList = new ArrayList<>();
        try {
            // Opgave 1.1
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(fileName));
            Element rootElement = doc.getDocumentElement();
            NodeList childNodes = rootElement.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                if (childNodes.item(i).getNodeType() != Node.ELEMENT_NODE) continue;
                Element e = (Element) childNodes.item(i);
                myList.add(new MarathonLoper(
                        getChildText(e, "naam"),
                        getChildText(e, "herkomst"),
                        LocalDate.parse(getChildText(e, "wedstrijddatum"), DateTimeFormatter.ISO_LOCAL_DATE),
                        Integer.parseInt(getChildText(e,"seconden"))
                        ));
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return myList;
    }

    private static String getChildText(Element parent, String name) {
        Element element = (Element) parent.getElementsByTagName(name).item(0);
        return element.getTextContent();
    }

    public static void writeJson(List<MarathonLoper> marathonLoperListList, String fileName) {
        // Opgave 1.4
        GsonBuilder builder = new GsonBuilder();
                Gson gson = builder.setPrettyPrinting().create();
                try (FileWriter writer = new FileWriter(fileName)) {
                    writer.write(gson.toJson(marathonLoperListList));
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
}
