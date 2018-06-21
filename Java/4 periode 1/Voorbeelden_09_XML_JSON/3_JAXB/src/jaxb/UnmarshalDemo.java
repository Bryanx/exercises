package jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnmarshalDemo {

    public static void main(String[] args) {

        try {
            JAXBContext context = JAXBContext.newInstance(Product.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            File file = new File("product.xml");

            Product product = (Product) unmarshaller.unmarshal(file);
            System.out.println("Na unmarshal:");
            System.out.println(product);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}