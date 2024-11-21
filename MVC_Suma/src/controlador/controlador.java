package controlador;
import java.awt.event.*;
import modelo.*;
import vista.*;

public class controlador implements ActionListener{
    
    private modelo modelo;
    private vista vista;

    public controlador(modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSuma.addActionListener(this);
    }
    
    public void iniciar_vista(){
        vista.setLocationRelativeTo(null);
        vista.txtNumero1.setText(String.valueOf(modelo.getValor1()));
        vista.txtNumero2.setText(String.valueOf(modelo.getValor2()));
        vista.txtResultado.setText(String.valueOf(modelo.getSumar()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setValor1(Integer.parseInt(vista.txtNumero1.getText()));
        modelo.setValor2(Integer.parseInt(vista.txtNumero2.getText()));
        modelo.sumar();
        vista.txtResultado.setText(String.valueOf(modelo.getSumar()));
    }
    
    
    
}
