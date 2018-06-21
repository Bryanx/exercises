package conversie;

import apen.Aap;
import apen.Geslacht;
import jdk.internal.org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ConversieTools {

    public static List<Aap> readTxtFile(String bestand) throws IOException {
        List<Aap> list = new ArrayList<>();
        String regel = "";
        try (BufferedReader br = new BufferedReader(new FileReader(bestand))) {
            while ((regel = br.readLine()) != null) {
                //Elke regel in het bestand bevat de data van een aap, gescheiden door komma's
                StringTokenizer tokenizer = new StringTokenizer(regel, ",");

                String naam = tokenizer.nextToken();
                String soort = tokenizer.nextToken();
                String familie = tokenizer.nextToken();
                Geslacht geslacht = tokenizer.nextToken().charAt(0) == 'M' ? Geslacht.MAN : Geslacht.VROUW;
                LocalDate geboorte = LocalDate.parse(tokenizer.nextToken());
                double gewicht = Double.parseDouble(tokenizer.nextToken());
                String kooi = tokenizer.nextToken();

                // Nieuwe aap maken en toevoegen aan de List:
                list.add(new Aap(naam, soort, familie, geslacht, geboorte, gewicht, kooi));
            }
            return list;
        } catch (NoSuchElementException | NumberFormatException e1) {
            throw new IOException("Leesfout in regel: " + regel, e1);
        } catch (IOException e2) {
            throw new IOException("Het bronbestand " + bestand + " kan niet geopend worden", e2);
        }
    }

    public static String DomWriteXML(List<Aap> myList, String fileName) throws IOException {
        String output = "";
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("apen");
            doc.appendChild(rootElement);
            for (Aap aap : myList) {
                Element aapElement = doc.createElement("aap");

                aapElement.setAttribute("kooi", aap.getKooi());

                Element naam = doc.createElement("naam");
                naam.setTextContent(aap.getNaam());
                aapElement.appendChild(naam);

                Element soort = doc.createElement("soort");
                soort.setTextContent(aap.getSoort());
                aapElement.appendChild(soort);

                Element geslacht = doc.createElement("geslacht");
                geslacht.setTextContent(aap.getGeslacht().name());
                aapElement.appendChild(geslacht);
                Element gewicht = doc.createElement("gewicht");
                gewicht.setTextContent(String.valueOf(aap.getGewicht()));
                aapElement.appendChild(gewicht);

                rootElement.appendChild(aapElement);
            }

            DOMSource src = new DOMSource(doc);
            Transformer xf = TransformerFactory.newInstance().newTransformer();
            xf.setOutputProperty(OutputKeys.INDENT, "yes");
            xf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            xf.transform(src, new StreamResult(new File(fileName)));
            StringWriter writ = new StringWriter();
            xf.transform(src, new StreamResult(writ));
            output = writ.toString();
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
        return output;
    }
}
