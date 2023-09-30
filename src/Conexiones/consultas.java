package Conexiones;
import Formularios.FormLogin;
import Formularios.Inicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class consultas {

    public void guardarUsuario(String usuario, String password) {
        ConexionDB db = new ConexionDB();
        String sql = "insert into usuarios(nombre, contraseña) values ('" + usuario + "', '" + password + "');";
        Statement st;
        Connection conexion = db.conectar();
        try {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void consultarUsuario(String user, String pass) {
        ConexionDB db = new ConexionDB();
        String usuarioCorrecto = null;
        String passCorrecto = null;

        try {
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT nombre, contraseña FROM usuarios WHERE nombre = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                usuarioCorrecto = rs.getString("nombre");
                passCorrecto = rs.getString("contraseña");
            }

            if (user.equals(usuarioCorrecto) && pass.equals(passCorrecto)) {
                //JOptionPane.showMessageDialog(null, "Login correcto. Bienvenido " + user);
  
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
               
          
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                FormLogin login = new FormLogin();
                login.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}
