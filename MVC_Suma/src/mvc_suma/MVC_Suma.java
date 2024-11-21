package mvc_suma;
import controlador.*;
import modelo.*;
import vista.*;

public class MVC_Suma {

    public static void main(String[] args) {
        // TODO code application logic here
        modelo m = new modelo();
        vista v = new vista();
        controlador c = new controlador(m, v);
        
        c.iniciar_vista();
        v.setVisible(true);
        
    }
    
}
