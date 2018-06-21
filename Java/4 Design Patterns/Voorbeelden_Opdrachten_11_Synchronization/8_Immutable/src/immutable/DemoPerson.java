package immutable;

import java.util.ArrayList;
import java.util.List;

public class DemoPerson {
    public static void main(String[] args) {
        Address address1 = new Address("Pennsylvania Avenue", 1600, "Washington DC");
        List<String> list1 = new ArrayList<>();
        list1.add("Melania Trump");
        list1.add("Mike Pence");
        list1.add("Jared Kushner");
        String name = "Donald Trump";
        Person person = new Person(name,71, address1, list1);

        //Controle afdruk:
        System.out.println("Na aanmaak:");
        System.out.println(person);

        //Proberen te wijzigen:
        Address address2 = person.getAddress();
        address2.setStreet("Nationalestraat 5");
        address2.setZip(2000);
        address2.setCity("Antwerpen");
        List<String> list2 = person.getFriends();
        list2.clear();
        list2.add("Kim Jong-un");

        //Controle afdruk:
        System.out.println("\nNa poging tot wijziging:");
        System.out.println(person);
    }
}

/*
Verwachte afdruk:
Na aanmaak:
Donald Trump (age 71)
	Adress: Pennsylvania Avenue, 1600 Washington DC
	Friends: [Melania Trump, Mike Pence, Jared Kushner]

Na poging tot wijziging:
Donald Trump (age 71)
	Adress: Pennsylvania Avenue, 1600 Washington DC
	Friends: [Melania Trump, Mike Pence, Jared Kushner]
 */