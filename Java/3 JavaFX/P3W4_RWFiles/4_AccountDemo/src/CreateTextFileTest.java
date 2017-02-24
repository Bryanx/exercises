import accountIO.CreateTextFile;

public class CreateTextFileTest {
    public static final String FILE_NAME = "4_AccountDemo/files/clients.txt";

    public static void main(String[] args) {
        CreateTextFile application = new CreateTextFile();

        application.openFile(FILE_NAME);
        application.addRecords();
        application.closeFile();
    }
}

/*
To terminate input, type 0 for the account number.

Enter account number (>0), first name, last name and balance
? 100 Bob Jones 24,98
Enter account number (>0), first name, last name and balance
? 200 Steve Doe -345,67
Enter account number (>0), first name, last name and balance
? 300 Pam White 0,00
Enter account number (>0), first name, last name and balance
? 400 Sam Stone -42,16
Enter account number (>0), first name, last name and balance
? 500 Sue Rich 224,62
Enter account number (>0), first name, last name and balance
? 0
 */