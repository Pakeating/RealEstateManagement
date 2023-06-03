
package interaccionDB;
import java.sql.*;

/**
 *Autor: Francisco Linares Santamaria. 
 * Esta clase realiza las labores de conexion y desconexion a la base de datos.
 */
public class ConexionDB {
    private Connection miConexion;
    public Connection conectar(String usuario, String pass){
        try {
            miConexion=DriverManager.getConnection("jdbc:mariadb://localhost:3306/alquileres", usuario, pass);
            return miConexion;
        } catch (SQLException e) {
            System.out.println("Error de conexion");
            return null;
        }
    }
    public Connection getConexion(){
        return miConexion;
    }
    
    public boolean cerrarConexion(){
        try {
            miConexion.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
