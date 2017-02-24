package accountIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private Scanner input;

    public void openFile(String fileName) {
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.out.println("Error opening file.");
            System.exit(1);
        }
    }

    public void readRecords() {
        Account account = new Account();
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

        try {
            while (input.hasNext()) {
                account.setAccount(input.nextInt());
                account.setFirstName(input.next());
                account.setLastName(input.next());
                account.setBalance(input.nextDouble());

                System.out.printf("%-10d%-12s%-12s%10.2f%n", account.getAccount(),
                        account.getFirstName(), account.getLastName(), account.getBalance());
            }
        } catch (NoSuchElementException ex) {
            System.out.println("File improperly formed.");
            input.close();
            System.exit(1);
        } catch (IllegalStateException ex) {
            System.out.println("Error reading from file.");
            System.exit(1);
        }
    }

    public void closeFile() {
        if (input != null) {
            input.close();
        }
    }
}
