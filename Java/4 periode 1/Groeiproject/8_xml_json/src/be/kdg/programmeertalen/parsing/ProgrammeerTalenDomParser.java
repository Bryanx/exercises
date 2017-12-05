package be.kdg.programmeertalen.parsing;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.model.Stijl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/17 09:58
 */
public class ProgrammeerTalenDomParser {

    private static final String file = "8_xml_json/files/programmeertalen.xml";
    private NodeList taalNodes;

    public ProgrammeerTalenDomParser() {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(file));
            Element rootElement = doc.getDocumentElement();
            taalNodes = rootElement.getChildNodes();
        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    public ProgrammeerTalen getContentXML() {
        List<ProgrammeerTaal> talenList = new ArrayList<>();
        for (int i = 0; i < taalNodes.getLength(); i++) {
            if (taalNodes.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            Element e = (Element) taalNodes.item(i);
            talenList.add(new ProgrammeerTaal(
                    getChildText(e,"naam"),
                    getChildText(e, "oprichter"),
                    e.getAttribute("extension-name"),
                    Double.parseDouble(getChildText(e, "laatste-versie")),
                    Integer.parseInt(getChildText(e, "aantal-gebruikers")),
                    Stijl.valueOf(getChildText(e,"stijl")),
                    LocalDate.parse(getChildText(e,"opgericht-in"), DateTimeFormatter.ISO_DATE)
            ));
        }
        ProgrammeerTalen talen = new ProgrammeerTalen();
        talenList.forEach(talen::voegToe);
        return talen;
    }

    private static String getChildText(Element parent, String name) {
        Element element = (Element) parent.getElementsByTagName(name).item(0);
        return element.getTextContent();
    }
}
