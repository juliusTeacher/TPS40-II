package crudmvc;
import modelo.*;
import vista.*;
import controlador.*;

public class CrudMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmEmpleados vistaC = new frmEmpleados();
        EmpleadosDAO modeloC = new EmpleadosDAO();
        ControladorCRUD controlaC = new ControladorCRUD(vistaC, modeloC);
        
        vistaC.setVisible(true);
        vistaC.setLocationRelativeTo(null);
    }
    
}
