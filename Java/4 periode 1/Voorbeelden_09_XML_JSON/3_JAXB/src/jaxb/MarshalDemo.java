package jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MarshalDemo {
    public static void main(String[] args) throws Exception {

        JAXBContext context = JAXBContext.newInstance(Product.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); //voor layout

        Product product = new Product("W11", "Widget Number One", 300.0);

        marshaller.marshal(product, new File("product.xml"));
        System.out.println("File created");

    }
}