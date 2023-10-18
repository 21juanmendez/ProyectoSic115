package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import org.postgresql.Driver;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author juann
 */
public class ConexionDB {

    // Declaramos la conexion a mysql
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver = "org.postgresql.Driver";
    private static final String user = "root";
    private static final String pass = "1999";
    private static final String url = "jdbc:postgresql://localhost:5433/Sic115";

    // Funcion que va conectarse a mi bd de mysql
    public Connection conectar() {
        con = null;
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
        return con;
    }
}
