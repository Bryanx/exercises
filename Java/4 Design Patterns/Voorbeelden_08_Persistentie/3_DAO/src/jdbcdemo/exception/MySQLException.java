package jdbcdemo.exception;

import java.sql.SQLException;

/**
 * Eigen Exception klasse die de info uit de meegegeven oorspronkelijke SQLException ophaalt en op het scherm toont.
 */
public class MySQLException extends RuntimeException {
    public MySQLException(SQLException e) {
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState = " + e.getSQLState());
        System.out.println("Error code = " + e.getErrorCode());
    }
}
