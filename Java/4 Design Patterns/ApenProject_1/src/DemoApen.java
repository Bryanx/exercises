import apen.Aap;
import apen.Geslacht;
import conversie.ConversieTools;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class DemoApen {
    public static void main(String[] args) {
        try {
            List<Aap> apenList = ConversieTools.readTxtFile("Apendata.txt");

	        //Todo 1A: filter enkel mannetjesapen, sorteer op kooi en print
	        System.out.println("Alle mannetjes apen, gesorteerd op kooi:");
	        apenList.stream()
                    .filter(a -> a.getGeslacht() == Geslacht.MAN)
                    .sorted((Comparator.comparing(Aap::getKooi)))
                    .forEach(System.out::println);

	        //Todo 1B: bereken de gemiddelde leeftijd van mannetjesapen
            double gemLeeftijd = apenList.stream()
                    .filter(a -> a.getGeslacht() == Geslacht.MAN)
                    .mapToDouble(a -> (double) a.getLeeftijd())
                    .average().getAsDouble();

            System.out.printf("Gemiddelde leeftijd: %.1f jaar\n\n", gemLeeftijd);

            String XMLresult = ConversieTools.DomWriteXML(apenList, "MannetjesApen.xml");
            System.out.println(XMLresult);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

/**
 * GEWENSTE AFDRUK:
 *
 Alle mannetjes apen, gesorteerd op kooi:
 Koko            bonobo          mensapen          M   geboren: 1981    38,0 kg   kooi: G199
 Gust            gorilla         mensapen          M   geboren: 1980   175,0 kg   kooi: G201
 Kingkong        orang-oetan     mensapen          M   geboren: 1982    67,0 kg   kooi: G214
 Louie           orang-oetan     mensapen          M   geboren: 1992    75,0 kg   kooi: G215
 Shout           brulaap         grijpstaartapen   M   geboren: 1997     6,0 kg   kooi: K006
 Grompy          brulaap         grijpstaartapen   M   geboren: 1999     7,2 kg   kooi: K006
 Pinokkio        neusaap         bladapen          M   geboren: 2003    11,0 kg   kooi: K016
 Monkey          leeuwaap        klauwapen         M   geboren: 2002     0,7 kg   kooi: K033
 Java            leeuwaap        klauwapen         M   geboren: 2010     0,4 kg   kooi: K034
 Gemiddelde leeftijd: 21,0 jaar

 <?xml version="1.0" encoding="UTF-8"?>
 <apen>
 <aap kooi="G199">
 <naam>Koko</naam>
 <soort>bonobo</soort>
 <geslacht>man</geslacht>
 <gewicht>38.0</gewicht>
 </aap>
 <aap kooi="G201">
 <naam>Gust</naam>
 <soort>gorilla</soort>
 <geslacht>man</geslacht>
 <gewicht>175.0</gewicht>
 </aap>
 <aap kooi="G214">
 <naam>Kingkong</naam>
 <soort>orang-oetan</soort>
 <geslacht>man</geslacht>
 <gewicht>67.0</gewicht>
 </aap>
 <aap kooi="G215">
 <naam>Louie</naam>
 <soort>orang-oetan</soort>
 <geslacht>man</geslacht>
 <gewicht>75.0</gewicht>
 </aap>
 <aap kooi="K006">
 <naam>Shout</naam>
 <soort>brulaap</soort>
 <geslacht>man</geslacht>
 <gewicht>6.0</gewicht>
 </aap>
 <aap kooi="K006">
 <naam>Grompy</naam>
 <soort>brulaap</soort>
 <geslacht>man</geslacht>
 <gewicht>7.2</gewicht>
 </aap>
 <aap kooi="K016">
 <naam>Pinokkio</naam>
 <soort>neusaap</soort>
 <geslacht>man</geslacht>
 <gewicht>11.0</gewicht>
 </aap>
 <aap kooi="K033">
 <naam>Monkey</naam>
 <soort>leeuwaap</soort>
 <geslacht>man</geslacht>
 <gewicht>0.65</gewicht>
 </aap>
 <aap kooi="K034">
 <naam>Java</naam>
 <soort>leeuwaap</soort>
 <geslacht>man</geslacht>
 <gewicht>0.42</gewicht>
 </aap>
 </apen>
 */
