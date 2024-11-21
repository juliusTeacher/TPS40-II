package modelo;
import java.sql.*;

public class Conexion {
    
    private Connection con = null;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_empresa", "root", "");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error de acceso: "+ex);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
