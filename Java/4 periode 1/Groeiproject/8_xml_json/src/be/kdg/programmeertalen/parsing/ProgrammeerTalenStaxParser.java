package be.kdg.programmeertalen.parsing;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;
import javax.xml.stream.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/17 09:25
 */
public class ProgrammeerTalenStaxParser {

    private XMLStreamWriter writer;
    private ProgrammeerTalen talen;

    public ProgrammeerTalenStaxParser(ProgrammeerTalen talen, String pad) {
        this.talen = talen;
        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            writer = new IndentingXMLStreamWriter(xmlOutputFactory.createXMLStreamWriter(new FileWriter(pad)));
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }

    public void writeXML() {
        try {
            writer.writeStartDocument();
            writer.writeStartElement("programmeertalen");
            List<ProgrammeerTaal> gesorteerdOpNaam = talen.gesorteerdOpNaam();
            for (ProgrammeerTaal taal : gesorteerdOpNaam) {
                writer.writeStartElement("programmeertaal");
                writer.writeAttribute("extension-name", taal.getExtensionName());
                writeElement(writer, "naam", taal.getNaam());
                writeElement(writer, "stijl", taal.getStijl().name());
                writeElement(writer, "oprichter", taal.getOprichter());
                writeElement(writer, "aantal-gebruikers", String.valueOf(taal.getAantalGebruikers()));
                writeElement(writer, "laatste-versie", String.valueOf(taal.getLaatsteVersie()));
                writeElement(writer, "opgericht-in", taal.getOpgerichtIn().format(DateTimeFormatter.ISO_DATE));
                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.close();
            System.out.println("File saved!");
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void writeElement(XMLStreamWriter xmlStreamWriter, String naam, String inhoud) throws XMLStreamException {
        xmlStreamWriter.writeStartElement(naam);
        xmlStreamWriter.writeCharacters(inhoud);
        xmlStreamWriter.writeEndElement();
    }
}
