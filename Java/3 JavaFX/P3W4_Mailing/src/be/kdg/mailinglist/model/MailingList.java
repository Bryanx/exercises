package be.kdg.mailinglist.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MailingList {
    private static final File BESTAND = new File("email_adressen.txt");

    private final Set<EmailAddress> addresses;

    public MailingList() {
        this.addresses = new TreeSet<>();
    }

    public void addEmailAddress(EmailAddress address) {
        this.addresses.add(address);
    }

    public List<String> getEmailAddresses() {
        final List<String> stringList = this.addresses.stream().map(EmailAddress::toString).collect(Collectors.toList());
        return Collections.unmodifiableList(stringList);
    }

    public void removeEmailAddress(String address) {
        for (Iterator<EmailAddress> i = this.addresses.iterator(); i.hasNext();) {
            EmailAddress emailAddress = i.next();
            if (emailAddress.toString().equals(address)) {
                i.remove();
                return;
            }
        }
    }

    public void loadFromDisk() throws IOException {
        // Hier aanvullen...
        try (Scanner scanner = new Scanner(BESTAND)){
            while (scanner.hasNext()) {
                String regel = scanner.nextLine();
                try {
                    EmailAddress emailAddress = new EmailAddress(regel);
                    addresses.add(emailAddress);
                } catch (EmailAddressException eae) {
                    System.out.println("Invalid email adres in file...");
                    System.out.println("Ignoring");
                }
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public void saveToDisk() throws IOException {
        // Hier aanvullen...
        try (PrintWriter printWriter = new PrintWriter(BESTAND)){
            for (EmailAddress address : addresses) {
                printWriter.format("%s%n",address);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
}
