package immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Person {
    private final String name;
    private final int age;
    private final Address address;
    private final List<String> friends;

    public Person(String name, int age, Address address, List<String> friends) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getStreet(),address.getZip(),address.getCity());
        this.friends = new ArrayList<>(friends);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address.getStreet(),address.getZip(),address.getCity());
    }

    public List<String> getFriends() {
        return new ArrayList<>(friends);
    }

    @Override
    public String toString() {
        return String.format("%s (age %d)\n\tAdress: %s\n\tFriends: %s",
                name, age, address, friends);
    }
}
