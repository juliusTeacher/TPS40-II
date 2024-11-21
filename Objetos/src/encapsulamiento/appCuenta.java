package encapsulamiento;
import java.util.Scanner;

public class appCuenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;
        
        Cuenta c1 = new Cuenta();
        System.out.print("Nombre: ");
        nombre = input.nextLine();
        System.out.print("Número de cuenta: ");
        numero = input.nextLine();
        System.out.print("Tipo de interes: ");
        tipo = Double.parseDouble(input.nextLine());
        System.out.print("Saldo, $");
        importe = Double.parseDouble(input.nextLine());
        
        c1.setNombre(nombre);
        c1.setNumeroCuenta(numero);
        c1.setTipoInteres(tipo);
        c1.setSaldo(importe);
        
        Cuenta c2 = new Cuenta("Julio Castaño", "3456997185", 1.25, 360000);
        
        Cuenta c3 = new Cuenta(c1);
        System.out.println("Datos de la Cuenta No. 1");
        System.out.println("Nombre del cliente: "+c1.getNombre());
        System.out.println("Número de cuenta: "+c1.getNumeroCuenta());
        System.out.println("Tipo de interés: "+c1.getTipoInteres());
        System.out.println("Saldo, $"+c1.getSaldo());
        System.out.println();
        
        c1.ingreso(400000);
        System.out.println("Saldo $"+c1.getSaldo());
        
        System.out.println("Datos de la cuenta No.2");
        System.out.println("Nombre del cliente: "+c2.getNombre());
        System.out.println("Número de cuenta: "+c2.getNumeroCuenta());
        System.out.println("Tipo de interés: "+c2.getTipoInteres());
        System.out.println("Saldo,  $"+c2.getSaldo());
        System.out.println();
        
        System.out.println("Datos de la cuenta No.3");
        System.out.println("Nombre del cliente: "+c3.getNombre());
        System.out.println("Número de cuenta: "+c3.getNumeroCuenta());
        System.out.println("Tipo de interés: "+c3.getTipoInteres());
        System.out.println("Saldo,  $"+c3.getSaldo());
        System.out.println();
        
        //Transferencia de $100,000 desde la cuenta No.3 hacia la cuenta No.2
        if(c3.transferencia(c2, 100000)){
            System.out.println("Transferencia realizada");
        }
        else{
            System.out.println("No se realizó la transferencia, intente mas tarde!");
        }
        
        //Mostrar saldo actual de la cuenta No.2
        System.out.println("Saldo de la cuenta No.2");
        System.out.println("Saldo actual, $"+c2.getSaldo());
        System.out.println();
        
        //Mostrar saldo actual de la cuenta No.3
        System.out.println("Saldo de la cuenta No.3");
        System.out.println("Saldo actual "+c3.getSaldo());
        System.out.println();
    }
    
}
