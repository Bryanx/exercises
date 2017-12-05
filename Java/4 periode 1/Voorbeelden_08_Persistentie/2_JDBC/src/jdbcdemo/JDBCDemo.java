package jdbcdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Deze code is niet ideaal, want alles in de main :-(
 * Voorlopig maken we nog geen gebruik van het DAO-pattern!
 * Want de bedoeling is om de verschillende stappen duidelijk te maken,
 * nodig voor het werken met JDBC
 */
public class JDBCDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        PreparedStatement prep = null;

        // STAP 1. Registreer JDBC driver
        // niet meer nodig sinds java 7 / JDBC 4.1
        /*
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } */

        try {

            // STAP 2. Maak een verbinding met de database
            connection = DriverManager.getConnection("jdbc:hsqldb:file:2_JDBC/data/studenten", "sa", "");

            // STAP 3. Maak een SQL-query en voer die uit
            // 3A Tabel verwijderen en opnieuw aanmaken:
            statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS studenten");
            String createQuery = "CREATE TABLE studenten " +
                    "(id INTEGER NOT NULL IDENTITY," +
                    "naam VARCHAR(30) NOT NULL," +
                    "score DOUBLE)";
            statement.execute(createQuery);

            // 3B Nieuw record toevoegen (merk op: NULL voor id, want PK wordt automatisch gegenereerd)
            int rowsAffected = statement.executeUpdate("INSERT INTO studenten VALUES (NULL, 'Kasper', 68.5)");

            // 3C Nog 2 records toevoegen, deze keer gebruiken we een PreparedStatement:
            prep = connection.prepareStatement("INSERT INTO studenten(naam,score)VALUES (?,?)");
            prep.setString(1, "Melchior");
            prep.setDouble(2, 54.8);
            rowsAffected += prep.executeUpdate();
            prep.setString(1, "Balthazar");
            prep.setDouble(2, 44.4);
            rowsAffected += prep.executeUpdate();
            System.out.println("rowsAffected: " + rowsAffected);

            statement.execute("DELETE FROM STUDENTEN WHERE SCORE > 60");
            prep = connection.prepareStatement("UPDATE STUDENTEN SET NAAM=? WHERE ID=?");
            prep.setString(1,"Bryan");
            prep.setInt(2,2);
            prep.executeUpdate();

            // STAP 4. Haal de data op in een ResultSet en verwerk
            List<Student> myList = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM studenten");
            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("naam"),
                        resultSet.getDouble("score"));
                myList.add(student);
            }

            System.out.println("Opgehaalde data:");
            myList.forEach(System.out::println);

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState = " + e.getSQLState());
            System.out.println("Error code = " + e.getErrorCode());
        } finally {
            // STAP 5. Verbreek de verbinding met de database
            try {
                if (statement != null) statement.close();
                if (prep != null) prep.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
OUTPUT:
rowsAffected: 3
Opgehaalde data:
  0 Kasper               68,5
  1 Melchior             54,8
  2 Balthazar            44,4
 */

