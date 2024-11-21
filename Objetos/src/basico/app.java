package basico;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2;
        Matematica m = new Matematica();
        
        System.out.println("Programa orientado a objetos");
        System.out.print("Digite número 1: ");
        num1 = Float.parseFloat(input.nextLine());
        System.out.print("Digite número 2: ");
        num2 = Float.parseFloat(input.nextLine());
        System.out.println("La suma es: "+m.suma(num1,num2));
        System.out.println("La resta es: "+m.resta(num1,num2));
        System.out.println("La multiplicación es: "+m.multiplicacion(num1, num2));
        System.out.println("La división es: "+m.division(num1, num2));
    }
    
}
