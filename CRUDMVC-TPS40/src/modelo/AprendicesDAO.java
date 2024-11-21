package modelo;
import java.sql.*;
import java.util.*;

public class AprendicesDAO {    
    
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /* Método para listar los aprendices */
    public List listar(){
        List<Aprendices> lista = new ArrayList<>();
        String sql = "SELECT * FROM aprendices";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Aprendices a = new Aprendices();
                a.setAprendizId(rs.getInt("aprendizId"));
                a.setNombre(rs.getString("nombre"));
                a.setDireccion(rs.getString("direccion"));
                a.setEmail(rs.getString("email"));
                lista.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar "+e.getMessage());
        }
        return lista;
    }
    
    /* Método para insertar los aprendices */
    public int agregar(Aprendices a){
        int r = 1; //La variable r nos indica que es el registro ha sido insertado!!
        String sql = "INSERT INTO aprendices (aprendizId, nombre, direccion, email) VALUES (?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(a.getAprendizId()));
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getDireccion());
            ps.setString(4, a.getEmail());
            ps.executeUpdate();
            if(r == 1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar: "+e.getSQLState());
        }
        return r;
    }
    
    /* Método para actualizar la tabla: aprendices */
    public int actualizar(Aprendices a){
        int r = 0; //Se inicializa la respuesta en false para que mas adelante se pueda actualizar los datos
        String sql = "UPDATE aprendices SET nombre=?, direccion=?, email=? WHERE aprendizId=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(4, Integer.toString(a.getAprendizId()));
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getDireccion());
            ps.setString(3, a.getEmail());
            r = ps.executeUpdate();
            if(r == 1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar: "+e.getSQLState());
        }
        return r;
    }
    
    /* Método para eliminar registros */
    public void eliminar(int id){
        String sql = "DELETE FROM aprendices WHERE aprendizId = "+id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al conectar: "+e.getSQLState());
        }
    }
    
}
