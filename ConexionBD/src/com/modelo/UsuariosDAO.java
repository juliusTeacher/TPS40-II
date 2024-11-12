package com.modelo;
import java.sql.*; 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class UsuariosDAO {
    
    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    /* Método para registrar usuarios */
    public boolean registrar(Usuarios usr){
        
        String sql = "INSERT INTO usuarios (usuario, password, nombre, correo, id_tipo) VALUES (?,?,?,?,?)";
        try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getCorreo());
            ps.setInt(5, usr.getId_tipo());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: "+e);
            System.out.println("Error al registrar: "+e);
            return false;
        }
    }
    
    /* Método para conocer si el usuario existe */
    public int existeUsuario(String usuario){
        String sql = "SELECT COUNT(id) FROM usuarios WHERE usuario = ?";
        try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            return 1;
        }
    }
    
    /* Metódo para establecer el correo electrónico del usuario */
    public boolean esMail(String correo){
        
        //Patrón para validar el e-mail
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@*"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2.})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }
    
    /* Método para ingresar al sistema: LOGIN */
    public boolean login(Usuarios usr){
        String sql = "SELECT id, usuario, password, nombre, id_tipo FROM usuarios WHERE usuario = ?";
        try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            if(rs.next()){
                if(usr.getPassword().equals(rs.getString(3))){
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(rs.getInt(5));
                    return true;
                }
                else{
                    return false;
                }
                
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }
   
}
