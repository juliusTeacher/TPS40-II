package figurageometrica;
import java.util.Scanner;

public class FiguraGeometrica {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double area, volumen, radio;
        System.out.print("Ingrese el radio (cm): ");
        radio = Double.parseDouble(input.nextLine());
        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = 1.33 * Math.PI * Math.pow(radio, 3);
        System.out.println("El area de la esfera es: "+ area +"cm.");
        System.out.println("El volumen de la esfera es: "+volumen +"cm.");
    }
   
}