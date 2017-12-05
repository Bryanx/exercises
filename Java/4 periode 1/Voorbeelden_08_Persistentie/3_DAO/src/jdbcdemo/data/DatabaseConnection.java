package jdbcdemo.data;

import jdbcdemo.exception.MySQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Algemene klasse voor het maken van een onlyConnection met een database.
 * Toepassing van het singleton pattern met lazy initialization.
 */
public class DatabaseConnection {
    private static Connection onlyConnection;

    private DatabaseConnection() {
        // lege private constructor (singleton)
    }

    public static Connection openConnection(String sourceUrl, String username,
                                            String password, String driverName) {
        if (onlyConnection == null) { //lazy initialization
            try {
                Class.forName(driverName);
                onlyConnection = DriverManager.getConnection(sourceUrl, username, password);
            } catch (ClassNotFoundException e) {
                System.out.println("JDBC Driver niet gevonden: " + e.getMessage());
                System.exit(1);
            } catch (SQLException e) {
                throw new MySQLException(e);
            }
        }
        return onlyConnection;
    }

    // Alleen uit te voeren na openConnection, waarschijnlijk overbodig!
    public static Connection getConnection() {
        return onlyConnection;
    }

    public static void closeConnection() {
        try {
            onlyConnection.close();
        } catch (SQLException e) {
            throw new MySQLException(e);
        }
        finally {
            onlyConnection = null;
        }
    }
}
