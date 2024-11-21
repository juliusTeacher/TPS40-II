package algoritmos;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cp = 0, cn = 0, cc = 0, n, numero;
        System.out.print("Cantidad de números: ");
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Número "+(i+1)+": ");
            numero = Integer.parseInt(input.nextLine());
            if(numero == 0){
                cc++; // cc = cc + 1
            }
            else if(numero > 0){
                cp++;
            }
            else{
                cn++;
            }
        }
        System.out.println("Cantidad de positivos: "+cp);
        System.out.println("Cantidad de negativos: "+cn);
        System.out.println("Cantidad de neutros: "+cc);
    }
    
}
