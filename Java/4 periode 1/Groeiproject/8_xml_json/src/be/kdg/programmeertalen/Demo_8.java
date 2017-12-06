package be.kdg.programmeertalen;

import be.kdg.programmeertalen.data.Data;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.parsing.ProgrammeerTalenDomParser;
import be.kdg.programmeertalen.parsing.ProgrammeerTalenGsonParser;
import be.kdg.programmeertalen.parsing.ProgrammeerTalenJaxbParser;
import be.kdg.programmeertalen.parsing.ProgrammeerTalenStaxParser;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_8 {
    public static void main(String[] args) {

        ProgrammeerTalen talen = new ProgrammeerTalen();
        Data.getLijst().forEach(talen::voegToe);

//        ProgrammeerTalenStaxParser parser = new ProgrammeerTalenStaxParser(talen, "8_xml_json/files/programmeertalen.xml");
//        parser.writeXML();
//
//        ProgrammeerTalenDomParser dom = new ProgrammeerTalenDomParser();
//        dom.getContentXML().gesorteerdOpNaam().forEach(System.out::println);
//
//        ProgrammeerTalenJaxbParser.JaxbWriteXml("8_xml_json/files/programmeertalen.xml", talen);
//        ProgrammeerTalen talen2 =
//                ProgrammeerTalenJaxbParser.JaxbReadXml("8_xml_json/files/programmeertalen.xml", ProgrammeerTalen.class);
//        talen2.gesorteerdOpNaam().forEach(System.out::println);

        ProgrammeerTalenGsonParser.writeJson(talen, "8_xml_json/files/programmeertalen.txt");
        ProgrammeerTalenGsonParser.readJson("8_xml_json/files/programmeertalen.txt")
                .gesorteerdOpNaam().forEach(System.out::println);

    }
}
