package Vectores;
import java.util.Scanner;

/*
    Leer N números de un array e imprimir cuántos son positivos, negativos y neutros.
    Hallar el promedio de los positivos y negativos.
*/

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = 0, neg = 0, neutro = 0;
        int sumaPos = 0, sumaNeg = 0;
        System.out.print("Dimensión del array: ");
        int n = Integer.parseInt(input.nextLine());
        int numeros[] = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numeros["+(i+1)+"]: ");
            numeros[i] = Integer.parseInt(input.nextLine());
            if(numeros[i] == 0){
                neutro++;
            }
            else if(numeros[i] > 0){
                sumaPos += numeros[i];
                pos++;
            }
            else{
                sumaNeg += numeros[i];
                neg++;
            }
        }
        System.out.println("Cantidad de positivos: "+pos);
        System.out.println("Cantidad de negativos: "+neg);
        System.out.println("Cantidad de neutros: "+neutro);
        
        if(pos != 0){
            System.out.println("Promedio de positivos: "+sumaPos / pos);
        }
        else{
            System.out.println("Indique los números positivos");
        }
        
        if(neg != 0){
            System.out.println("Promedio de negativos: "+sumaNeg / neg);
        }
        else{
            System.out.println("Indique los números negativos");
        }
    }
    
}