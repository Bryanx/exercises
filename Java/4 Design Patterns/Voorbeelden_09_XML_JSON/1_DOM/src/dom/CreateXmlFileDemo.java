package dom;

import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;
import model.Person;
import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class CreateXmlFileDemo {

    private static final String file = "staxtest.xml";

    public static void main(String[] args) {
        //Testdata:
        List<Person> familyList = Arrays.asList(
                new Person("Homer", "Simpson", 45),
                new Person("Marge", "Simpson", 42),
                new Person("Bart", "Simpson", 10),
                new Person("Lisa", "Simpson", 8),
                new Person("Maggie", "Simpson", 1)
        );
    }


}

