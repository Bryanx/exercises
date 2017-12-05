package jdbcdemo.data;

import jdbcdemo.exception.MySQLException;
import jdbcdemo.model.Gebruiker;
import jdbcdemo.model.Gebruikers;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * De klasse GebruikersDAO voorziet alle toegang tot de database.
 * Hier worden dus alle CRUD-bewerkingen uitgewerkt
 * (in dit voorbeeld is dat beperkt tot wat strikt noodzakelijk was)
 * Toepassing van het singleton-pattern (wat zeker niet verplicht of noodzakelijk is)
 *
 * Opmerking:
 * Bij elke uitvoering van 'Statement statement = dataBaseConnection.createStatement()'
 * wordt gebruik gemaakt van try with resources. Na de uitvoering van het statement zal het
 * automatisch gesloten worden. Zie overbodig geworden close-statements in commentaar.
 */
public class GebruikersDAO {
    // Specifieke data voor de database
    private static final String driver = "org.hsqldb.jdbcDriver";
    private static final String url = "jdbc:hsqldb:file:3_DAO/database/demo";
    private static final String user = "sa";
    private static final String password = "";

    // We zorgen ervoor dat er slechts één DAO-object tegelijk aanwezig is: singleton pattern
    private static GebruikersDAO dao;
    private static Connection dataBaseConnection;

    private GebruikersDAO() {
        // lege private default constructor (singleton)
    }

    public synchronized static GebruikersDAO getInstance() {
        if (dao == null) {
            dataBaseConnection = DatabaseConnection.openConnection(url, user, password, driver);
            dao = new GebruikersDAO();
        }
        return dao;
    }

    public static void flushDAO() {
        DatabaseConnection.closeConnection();
        dao = null;
    }

    public void maakGebruikersDatabaseTabel() {
        // try with resources
        try (Statement statement = dataBaseConnection.createStatement()) {
            statement.executeUpdate("DROP TABLE IF EXISTS gebruikers");
            String create = "CREATE TABLE gebruikers " +
                    "(sleutel INTEGER NOT NULL IDENTITY," +
                    "voornaam VARCHAR(20) NOT NULL," +
                    "familienaam VARCHAR(30) NOT NULL," +
                    "gebruikersnaam VARCHAR(20) NOT NULL," +
                    "wachtwoord VARCHAR(20) NOT NULL)";
            statement.executeUpdate(create);

            // statement.close(); --> nu overbodig door try with resources
        } catch (SQLException e) {
            throw new MySQLException(e);
        }
    }

    public List<Gebruiker> getAllGebruikers() {
        List<Gebruiker> gebruikers = new ArrayList<>();
        // try with resources
        try (Statement statement = dataBaseConnection.createStatement()) {
            ResultSet result = statement.executeQuery("SELECT * FROM gebruikers");
            while (result.next()) {
                Gebruiker gebruiker = new Gebruiker(
                        result.getInt("sleutel"),
                        result.getString("voornaam"),
                        result.getString("familieNaam"),
                        result.getString("gebruikersnaam"),
                        result.getString("wachtwoord"));
                gebruikers.add(gebruiker);
            }
            // statement.close(); --> nu overbodig door try with resources
        } catch (SQLException e) {
            throw new MySQLException(e);
        }
        return Collections.unmodifiableList(gebruikers);
    }

    public void clearAllGebruikers() {
        try (Statement statement = dataBaseConnection.createStatement()) {
            String delete = "DELETE FROM gebruikers";  // maakt de tabel helemaal leeg
            statement.execute(delete);
            // statement.close(); --> nu overbodig door try with resources
        } catch (SQLException e) {
            throw new MySQLException(e);
        }
    }

    public void vulMetTestData() {
        clearAllGebruikers();

        Gebruikers gebruikers = new Gebruikers();
        List<Gebruiker> lijst = gebruikers.getGebruikers();

        try (PreparedStatement statement = dataBaseConnection.prepareStatement(
                "INSERT INTO gebruikers (" +
                        "sleutel, voornaam, familienaam, gebruikersnaam, wachtwoord)" +
                        "VALUES(?,?,?,?,?)")) {

            for (Gebruiker gebruiker : lijst) {
                statement.setInt(1, gebruiker.getSleutel());
                statement.setString(2, gebruiker.getVoornaam());
                statement.setString(3, gebruiker.getFamilienaam());
                statement.setString(4, gebruiker.getGebruikersnaam());
                statement.setString(5, gebruiker.getWachtwoord());
                statement.executeUpdate();
            }
            // statement.close(); --> nu overbodig door try with resources
        } catch (SQLException e) {
            throw new MySQLException(e);
        }
    }

    public boolean isGeldigeGebruiker(String gebruikersnaam, char[] wachtwoord) {
        try (PreparedStatement statement = dataBaseConnection.prepareStatement(
                "SELECT voornaam FROM gebruikers WHERE gebruikersnaam = ? " +
                        "AND wachtwoord = ?")) {
            statement.setString(1, gebruikersnaam);
            statement.setString(2, new String(wachtwoord));
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                // statement.close(); --> nu overbodig door try with resources
                return true;
            }
            // statement.close(); --> nu overbodig door try with resources
        } catch (SQLException e) {
            throw new MySQLException(e);
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
