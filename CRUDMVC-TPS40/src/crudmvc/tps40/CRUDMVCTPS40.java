package crudmvc.tps40;
import controlador.*;
import vista.*;

public class CRUDMVCTPS40 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        frmAprendiz vista = new frmAprendiz();
        Controlador c = new Controlador(vista);
        
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
    }
    
}
