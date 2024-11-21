package basico;
import java.util.Scanner;

public class appCuadratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x, y, z;
        System.out.println("POO - Ecuación cuadrática");
        System.out.print("A: ");
        x = Double.parseDouble(input.nextLine());
        System.out.print("B: ");
        y = Double.parseDouble(input.nextLine());
        System.out.print("C: ");
        z = Double.parseDouble(input.nextLine());
        Cuadratica c = new Cuadratica(x, y, z);
        c.calcular();
    }
    
}
