package modelo;
import java.sql.*;

public class Conexion {
    
   Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_tps40", "root", "");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("Error al conectar: "+ex);
       }
    }
    
    public Connection getConnection(){
        return con;
    }
   
}