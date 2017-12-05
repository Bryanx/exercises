import model.Exhibition;
import model.Museum;
import model.Museums;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * http://examples.javacodegeeks.com/core-java/xml/bind/jaxb-marshal-example/
 */
public class DemoWriteComplexListOfMuseums {
	public static void main(String[] args) {
		try {
			List<String> artistsReinaSofia = new ArrayList<String>();
			artistsReinaSofia.add("Picasso");
			artistsReinaSofia.add("Dali");
			artistsReinaSofia.add("Miro");
			Exhibition permanent = new Exhibition("Permanent Exhibition - Reina Sofia Museum",
				LocalDate.of
					(2017, 11, 1),
				LocalDate.of(2018, 1, 1),
				artistsReinaSofia);
			Museum reinaSofia = new Museum("Reina Sofia Museum", "Madrid", true, null,
				permanent
			);

			List<String> artistsPrado = new ArrayList<>();
			artistsPrado.add("Velazquez");
			artistsPrado.add("Goya");
			artistsPrado.add("Zurbaran");
			artistsPrado.add("Tiziano");
			Exhibition permanentPrado = new Exhibition("Permanent Exhibition - Prado Museum",
				LocalDate.of(2016, 11, 30), LocalDate.of(2018, 6, 15), artistsPrado
			);

			List<String> artistsSpecial = new ArrayList<String>();
			artistsSpecial.add("Mattise");
			Exhibition special = new Exhibition("Game of Bowls (1908), by Henri Matisse",
				LocalDate.of
					(2018, 1, 1),
				LocalDate.of(2018, 9, 30),
				artistsSpecial);

			Museum prado = new Museum("Prado Museum", "Madrid", false,
				special, permanentPrado
			);

			Museums museums = new Museums();
			museums.add(prado);
			museums.add(reinaSofia);

			JAXBContext jaxbContext = JAXBContext.newInstance(Museums.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(museums, new File("museums.xml"));
			jaxbMarshaller.marshal(museums, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
