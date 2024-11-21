package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.*;
import vista.*;

public class ControladorCRUD implements ActionListener{

    frmEmpleados form = new frmEmpleados();
    EmpleadosDAO dao = new EmpleadosDAO();
    
    public ControladorCRUD(frmEmpleados form, EmpleadosDAO dao){
        this.dao = dao;
        this.form = form;
        this.form.btnRegistrar.addActionListener(this);
        this.form.btnListar.addActionListener(this);
    }
    
    public void InicializarCRUD(){
        
    }
    
    public void LlenarTabla(JTable tablaD){
        DefaultTableModel modelo = new DefaultTableModel();
        tablaD.setModel(modelo);
        
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Email");
        
        Object[] columna = new Object[6];
        int numRegistros = dao.listarEmpleados().size();
        
        for (int i = 0; i < numRegistros; i++) {
            columna[0] = dao.listarEmpleados().get(i).getId_empleado();
            columna[1] = dao.listarEmpleados().get(i).getNombre();
            columna[2] = dao.listarEmpleados().get(i).getApellidos();
            columna[3] = dao.listarEmpleados().get(i).getDireccion();
            columna[4] = dao.listarEmpleados().get(i).getTelefono();
            columna[5] = dao.listarEmpleados().get(i).getEmail();
            modelo.addRow(columna);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== form.btnRegistrar){
            String cod_empleado = form.txtCodEmpleado.getText();
            String nom = form.txtNombre.getText();
            String ape = form.txtApellidos.getText();
            String dir = form.txtDireccion.getText();
            String tel = form.txtTelefono.getText();
            String em = form.txtEmail.getText();
            
            String rptaRegistro = dao.insertEmpleado(cod_empleado,nom,ape,dir,tel,em);
            
            if(rptaRegistro != null){
                JOptionPane.showMessageDialog(null, rptaRegistro);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error, intente de nuevo");
            }
        }
        
        if(e.getSource()== form.btnListar){
            LlenarTabla(form.tblEmpleados);
        }
    }
    
}
