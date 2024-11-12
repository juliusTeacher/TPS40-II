package com.modelo;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection con = null;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tps40_sena", "root", "");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso: "+ex);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    
}