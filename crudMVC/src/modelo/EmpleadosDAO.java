package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosDAO {
    
    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    /* Método para insertar un empleado */
    public String insertEmpleado(String cod_empleado, String nom, String ape, String dir, String tel, String em){
        String respRegistro = null;
        String sql = "INSERT INTO empleados(id_empleado,nombre,apellidos,direccion,telefono,email) VALUES(?,?,?,?,?,?)";
        try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, cod_empleado);
            ps.setString(2, nom);
            ps.setString(3, ape);
            ps.setString(4, dir);
            ps.setString(5, tel);
            ps.setString(6, em);
            ps.executeUpdate();
            System.out.println("¡Registro exitoso!");
        } catch (SQLException e) {
            System.out.println("Error al registrar: "+e);
        }
        return respRegistro;
    }
    
    /* Método para listar la tabla: Empleados */
    public ArrayList<Empleados> listarEmpleados(){
        ArrayList listaEmpleados = new ArrayList();
        Empleados emp;
        String sql = "SELECT * FROM empleados";
        try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                emp = new Empleados();
                emp.setId_empleado(rs.getString(1));
                emp.setNombre(rs.getString(2));
                emp.setApellidos(rs.getString(3));
                emp.setDireccion(rs.getString(4));
                emp.setTelefono(rs.getString(5));
                emp.setEmail(rs.getString(6));
                listaEmpleados.add(emp);
            }
        } catch (SQLException e) {
            System.out.println("No se muestra el listado: "+e);
        }
        return listaEmpleados;
    }
    
}
