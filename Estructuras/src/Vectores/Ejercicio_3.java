package Vectores;
import java.util.Scanner;
/*
    Crea un array de diez (10) posiciones de números con valores pedidos por teclado. Muestra por consola el índice
    y el valor al que corresponde. Haz dos funciones, uno para rellenar valores y otro para mostrar.
*/

public class Ejercicio_3 {
    static Scanner input = new Scanner(System.in);
    
    /* Función para rellenar(procesar, digitar) el array */
    public static void rellenarArray(int lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Ingrese un numero de la lista en la posición "+(i+1)+": ");
            lista[i] = Integer.parseInt(input.nextLine());
        }
    }
    
    /* Función para mostrar los datos del array */
    public static void mostrarArray(int lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el índice "+(i+1)+" se encuentra el valor: "+lista[i]);
        }
    }
    
    /* Programa principal */
    public static void main(String[] args) {
        
        final int longitud = 10;
        int array[] = new int[longitud];
        
        rellenarArray(array);
        mostrarArray(array);
        
    }
    
}
