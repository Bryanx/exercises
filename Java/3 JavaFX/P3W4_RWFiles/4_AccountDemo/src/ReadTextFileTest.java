import accountIO.ReadTextFile;

public class ReadTextFileTest {
    public static final String FILE_NAME = "4_AccountDemo/files/clients.txt";

    public static void main(String[] args) {
        ReadTextFile application = new ReadTextFile();
        application.openFile(FILE_NAME);
        application.readRecords();
        application.closeFile();
    }
}

/*
Account   First Name  Last Name      Balance
100       Bob         Jones            24,98
200       Steve       Doe            -345,67
300       Pam         White             0,00
400       Sam         Stone           -42,16
500       Sue         Rich            224,62
 */