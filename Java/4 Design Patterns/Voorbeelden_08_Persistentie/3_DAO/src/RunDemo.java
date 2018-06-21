import jdbcdemo.data.GebruikersDAO;
import jdbcdemo.view.LoginFrame;

/**
 *  De opstartklasse RunDemo
 *  Merk op dat de view is uitgewerkt met swing maar dit is irrelevant in dit voorbeeld
 *  Het zou dus ook JavaFX of een ander framework kunnen zijn.
 */
public class RunDemo {
    public static void main(String[] args) {
        GebruikersDAO dao = GebruikersDAO.getInstance(); // singleton pattern
//        dao.maakGebruikersDatabaseTabel();
        System.out.println("Database aangemaakt");
//        dao.vulMetTestData();
        System.out.println("Database gevuld met gebruikersdata");
        dao.getAllGebruikers().forEach(System.out::println);
//        new LoginFrame(); //Opvragen username en wachtwoord. Indien correct: toon overzicht van gebruikers
    }
}
