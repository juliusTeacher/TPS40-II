package retos;
import java.util.Scanner;

public class appReto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cod, precio, cantB, cMin;
        System.out.println("=== SISTEMA DE INVENTARIO ===");
        System.out.print("Código del producto: ");
        cod = Integer.parseInt(input.nextLine());
        System.out.print("Precio de compra, $");
        precio = Integer.parseInt(input.nextLine());
        System.out.print("Cantidad en Bodega(unidades): ");
        cantB = Integer.parseInt(input.nextLine());
        System.out.print("Cantidad mínima requerida en bodega(unidades): ");  
        cMin = Integer.parseInt(input.nextLine());
        
        reto1 p = new reto1(cod, precio, cantB, cMin);
        
        if(p.solicitarPedido()){
            System.out.println("Alerta, se solicita producto");
        }
        else{
            System.out.println("En este momento, no se solicita producto");
        }
        
    }
    
}
