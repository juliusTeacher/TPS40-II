package basico;
import java.util.Scanner;

public class appPlano2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.println("= = = PLANO 2D, Versión 1.0 = = =");
        System.out.print("Punto X: ");
        a = Double.parseDouble(input.nextLine());
        System.out.print("Punto Y: ");
        b = Double.parseDouble(input.nextLine());
        plano2D p = new plano2D(a, b);
        System.out.println("Distancia: "+p.distanciaOrigen());
        System.out.println("Cuadrante: "+p.cuadrante());
    }
    
}
