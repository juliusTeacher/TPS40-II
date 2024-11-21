package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.frmAprendiz;

public class Controlador implements ActionListener{
    
    Aprendices a = new Aprendices();
    AprendicesDAO dao = new AprendicesDAO();
    frmAprendiz f = new frmAprendiz();
    DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(frmAprendiz f) {
        this.f = f;
        listar(f.tblAprendiz);
        this.f.btnRegistrar.addActionListener(this);
        this.f.btnSeleccionarRegistro.addActionListener(this);
        this.f.btnModificar.addActionListener(this);
        this.f.btnEliminar.addActionListener(this);
    }
    
    /* Método para listar los datos en la tabla: tblAprendiz */
    public void listar(JTable tblAprendiz){
        modelo = (DefaultTableModel) tblAprendiz.getModel();
        List<Aprendices> datos = dao.listar();
        Object [] objeto = new Object[4];
        for (int i = 0; i < datos.size(); i++) {
            objeto[0] = datos.get(i).getAprendizId();
            objeto[1] = datos.get(i).getNombre();
            objeto[2] = datos.get(i).getDireccion();
            objeto[3] = datos.get(i).getEmail();
            modelo.addRow(objeto);
        }
        f.tblAprendiz.setModel(modelo);
    }
    
    /* Método para insertar los datos del aprendiz a través del botón del formulario */
    public void agregar(){
        int id = Integer.parseInt(f.txtCodigo.getText());
        String nom = f.txtNombre.getText();
        String dir = f.txtDireccion.getText();
        String em  = f.txtCorreo.getText();
        
        a.setAprendizId(id);
        a.setNombre(nom);
        a.setDireccion(dir);
        a.setEmail(em);
        
        int r = dao.agregar(a);
        if(r == 1){
            JOptionPane.showMessageDialog(null, "Registro exitoso con el código No."+a.getAprendizId());
        }
        else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    /* Metodo para actualizar el aprendiz por medio de la tabla y luego dar click en el botón: Modificar */
    public void actualizar(){
        int id = Integer.parseInt(f.txtCodigo.getText());
        String nom = f.txtNombre.getText();
        String dir = f.txtDireccion.getText();
        String em  = f.txtCorreo.getText();
        
        a.setAprendizId(id);
        a.setNombre(nom);
        a.setDireccion(dir);
        a.setEmail(em);
        
        int r = dao.actualizar(a);
        if(r == 1){
            JOptionPane.showMessageDialog(null, "¡Registro actualizado!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public void eliminar(){
        int fila = f.tblAprendiz.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(f, "Debe seleccionar el registro");
        }
        else{
            int id = Integer.parseInt((String)f.tblAprendiz.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            JOptionPane.showMessageDialog(f, "El registro ha sido eliminado!");
        }
    }
    
    /* Método para limpiar la tabla en el momento que el usuario agregue, edite y/o elimine */
    public void limpiarTabla(){
        for (int i = 0; i < f.tblAprendiz.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }
    
    
    /* Método para limpiar las cajas de texto */
    public void limpiarCajas(){
        f.txtCodigo.setText(null);
        f.txtNombre.setText(null);
        f.txtDireccion.setText(null);
        f.txtCorreo.setText(null);
        f.txtCodigo.requestFocus();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == f.btnRegistrar){
            agregar();
            limpiarTabla();
            listar(f.tblAprendiz);
            limpiarCajas();
        }
        
        if(e.getSource() == f.btnSeleccionarRegistro){
            int fila = f.tblAprendiz.getSelectedRow();
            if(fila == -1){
                JOptionPane.showMessageDialog(null, "Selecione el registro");
            }
            else{
                f.txtCodigo.setEditable(false);
                int id = Integer.parseInt((String)f.tblAprendiz.getValueAt(fila, 0).toString());
                String nom = f.tblAprendiz.getValueAt(fila, 1).toString();
                String dir = f.tblAprendiz.getValueAt(fila, 2).toString();
                String em  = f.tblAprendiz.getValueAt(fila, 3).toString();
                f.txtCodigo.setText(""+id);
                f.txtNombre.setText(nom);
                f.txtDireccion.setText(dir);
                f.txtCorreo.setText(em);
            }
        }
        
        if(e.getSource() == f.btnModificar){
            actualizar();
            limpiarTabla();
            listar(f.tblAprendiz);
            limpiarCajas();
            f.txtCodigo.setEditable(true);
        }
        
        if(e.getSource() == f.btnEliminar){
            eliminar();
            limpiarTabla();
            listar(f.tblAprendiz);
        }
        
    }
    
    

    
}
