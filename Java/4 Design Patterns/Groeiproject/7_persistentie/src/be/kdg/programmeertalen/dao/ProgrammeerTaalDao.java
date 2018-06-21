package be.kdg.programmeertalen.dao;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.model.Stijl;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/17 10:55
 */
public class ProgrammeerTaalDao implements CrudInterface {

    private static final String driver = "org.hsqldb.jdbcDriver";
//    private static final String databasePath = "jdbc:hsqldb:file:7_persistentie/db/programmeertaal";
    private static final String user = "sa";
    private static final String password = "";
    private static Connection connection = null;

    public ProgrammeerTaalDao(String databasePath) {
        maakConnectie(databasePath);
        maakTabel();
    }


    private static void maakConnectie(String databasePath) {
        try {
            connection = DriverManager.getConnection("jdbc:hsqldb:file:" + databasePath, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean create(ProgrammeerTaal taal) {

        try (PreparedStatement prep = connection.prepareStatement(
                "INSERT INTO TALENTABEL VALUES(NULL,?,?,?,?,?,?,?)")) {
            prep.setString(1, taal.getNaam());
            prep.setString(2, taal.getOprichter());
            prep.setString(3, taal.getExtensionName());
            prep.setDouble(4, taal.getLaatsteVersie());
            prep.setInt(5, taal.getAantalGebruikers());
            prep.setString(6, taal.getStijl().name());
            prep.setDate(7, Date.valueOf(taal.getOpgerichtIn()));
            int count = prep.executeUpdate();
            if (count != 0) {
                System.out.println("Added row: " + taal);
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public ProgrammeerTaal retrieve(int id) {
        ProgrammeerTaal taal = null;
        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery("SELECT * FROM TALENTABEL WHERE ID=" + id);
            result.next();
            taal = new ProgrammeerTaal(
                    result.getInt("ID"),
                    result.getString("NAAM"),
                    result.getString("OPRICHTER"),
                    result.getString("EXTENSIONNAME"),
                    result.getDouble("LAATSTEVERSIE"),
                    result.getInt("AANTALGEBRUIKERS"),
                    Stijl.valueOf(result.getString("STIJL")),
                    result.getDate("OPRICHTINGSDATUM").toLocalDate());
            return taal;
        } catch (SQLException e) {
            if (!e.getMessage().contains("ResultSet is empty")) System.err.println(e.getMessage());
        }
        return taal;
    }

    @Override
    public boolean update(ProgrammeerTaal taal) {
        int rowsChanged = 0;
        try (PreparedStatement prep = connection.prepareStatement(
                "UPDATE TALENTABEL SET NAAM=?,OPRICHTER=?,EXTENSIONNAME=?," +
                        "LAATSTEVERSIE=?,AANTALGEBRUIKERS=?,STIJL=?,OPRICHTINGSDATUM=?" +
                        "WHERE ID=" + taal.getId() + ";"
        )) {
            prep.setString(1, taal.getNaam());
            prep.setString(2, taal.getOprichter());
            prep.setString(3, taal.getExtensionName());
            prep.setDouble(4, taal.getLaatsteVersie());
            prep.setInt(5, taal.getAantalGebruikers());
            prep.setString(6, taal.getStijl().name());
            prep.setDate(7, Date.valueOf(taal.getOpgerichtIn()));
            rowsChanged = prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsChanged != 0;
    }

    @Override
    public boolean delete(int id) {
        boolean gelukt = false;
        try (Statement statement = connection.createStatement()) {
            int res = statement.executeUpdate("DELETE FROM TALENTABEL WHERE ID=" + id);
            gelukt = res == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gelukt;
    }

    public boolean truncate() {
        try (Statement statement = connection.createStatement()) {
            return statement.execute("DELETE FROM TALENTABEL");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ProgrammeerTalen filter(int limit) {
        ProgrammeerTalen talen = new ProgrammeerTalen();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM TALENTABEL WHERE AANTALGEBRUIKERS < " + limit);
            while (resultSet.next()) {
                ProgrammeerTaal temp = new ProgrammeerTaal(
                        resultSet.getInt("ID"),
                        resultSet.getString("NAAM"),
                        resultSet.getString("OPRICHTER"),
                        resultSet.getString("EXTENSIONNAME"),
                        resultSet.getDouble("LAATSTEVERSIE"),
                        resultSet.getInt("AANTALGEBRUIKERS"),
                        Stijl.valueOf(resultSet.getString("STIJL")),
                        resultSet.getDate("OPRICHTINGSDATUM").toLocalDate());
                talen.voegToe(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return talen;
    }

    private static void maakTabel() {
        try (Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE talenTabel IF EXISTS");

            String create = "CREATE TABLE talenTabel" +
                    "(id INTEGER NOT NULL IDENTITY, " +
                    "naam VARCHAR(30) NOT NULL, " +
                    "oprichter VARCHAR(50), " +
                    "extensionName VARCHAR(20)," +
                    "laatsteVersie DOUBLE," +
                    "aantalGebruikers INTEGER," +
                    "stijl VARCHAR(20)," +
                    "oprichtingsDatum Date)";
            statement.execute(create);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void close() {
        if (connection != null) try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
