
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class conexion {
    public static Connection conectar (){
        Connection c = null;
              try {
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/busesterra","postgres", "maxilillo");
         return c;
      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error al conectarse con la bdd"+e);
              }
              return (null);
    }                      
    }

