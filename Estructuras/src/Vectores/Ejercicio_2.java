package Vectores;
import java.util.Scanner;
/*
    Haga un algoritmo en Java que calcule el promedio de estaturas de N personas y además,
    preguntar cuántas personas son mas altas que el promedio y cuántas son mas bajas.
*/

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont_may = 0, cont_men = 0, n;
        float suma = 0, promedio;
        System.out.print("Dimensión del array: ");
        n = Integer.parseInt(input.nextLine());
        float estaturas[] = new float[n];
        for (int i = 0; i < estaturas.length; i++) {
            System.out.print("Estaturas["+(i+1)+"]: ");
            estaturas[i] = Float.parseFloat(input.nextLine());
            suma += estaturas[i]; // suma = suma + estaturas[i];
        }
        promedio = suma / estaturas.length;
        
        for (int i = 0; i < estaturas.length; i++) {
            if(estaturas[i] > promedio){
                cont_may ++; //cont_may = cont_may + 1;
            }
            else{
                cont_men ++; //cont_men = cont_men + 1;
            }
        }
        System.out.println("Promedio de estaturas: "+promedio);
        System.out.println("Promedio de estaturas mayores al promedio: "+cont_may);
        System.out.println("Promedio de estaturas menores al promedio: "+cont_men);
    }
    
}
