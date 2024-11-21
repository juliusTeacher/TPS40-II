package Vectores;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        float suma = 0, promedio;
        
        System.out.println("INTRODUCCIÓN A VECTORES CON JAVA");
        System.out.print("Establezca la longitud del vector: ");
        n = Integer.parseInt(input.nextLine());
        float notas [] = new float[n];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Notas["+(i+1)+"]: ");
            notas[i] = Float.parseFloat(input.nextLine());
            suma = suma + notas[i];
        }
        promedio = suma / notas.length;
        System.out.println("El promedio de notas es de: "+promedio);
    }
    
}