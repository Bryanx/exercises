package accountIO;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    private Formatter output;

    public void openFile(String fileName) {
        try {
            output = new Formatter(fileName);
        } catch (SecurityException ex) {
            System.out.println("You do not have write access to this file.");
            System.exit(1);
        } catch (FileNotFoundException ex) {
            System.out.println("Error opening or creating file.");
            System.exit(1);
        }
    }

    public void addRecords() {
        Account record = new Account();
        Scanner input = new Scanner(System.in);

        System.out.println("To terminate input, type 0 for the account number.");
        System.out.println();
        System.out.println("Enter account number (>0), first name, last name and balance");
        System.out.print("?");

        while (input.hasNext()) {
            try {
                record.setAccount(input.nextInt());
                if (record.getAccount() == 0 ) return;
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());

                if (record.getAccount() > 0) {
                    output.format("%d %s %s %.2f%n", record.getAccount(),
                            record.getFirstName(), record.getLastName(), record.getBalance());
                } else {
                    System.out.println("Account number must be greater than 0");
                }
            } catch (FormatterClosedException ex) {
                System.out.println("Error writing to file");
                return;
            } catch (NoSuchElementException ex) {
                System.out.println("Invalid input. Please try again");
                input.nextLine();  // clear input buffer
            }
            System.out.println("Enter account number (>0), first name, last name and balance");
            System.out.print("?");
        }
    }

    public void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}

