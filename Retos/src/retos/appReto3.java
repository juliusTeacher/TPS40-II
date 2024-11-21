package retos;
import java.util.Scanner;

public class appReto3 {
    public static void main(String[] args) {
        
        reto3 arrayProductos [] = new reto3[100];
        Scanner input = new Scanner(System.in);
        int cod, valor, cantB, cMin, cMax;
        
        System.out.print("Digite la cantidad de productos: ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.print("Código del producto No."+(i+1)+": ");
            cod = Integer.parseInt(input.nextLine());
            System.out.print("Precio de compra, $");
            valor = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad en bodega(unidades): ");
            cantB = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad mínima requerida en bodega(unidades): ");
            cMin = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad máxima permitida en inventario(unidades): ");
            cMax = Integer.parseInt(input.nextLine());
            
            arrayProductos[i] = new reto3(cod, valor, cantB, cMin, cMax);
        }
        
        int mayor = -1;
        reto3 pMen = arrayProductos[0];
        for (int i = 0; i < n; i++) {
            if(arrayProductos[i].solicitarPedido()){
                System.out.println("Alerta generada para el código No. "+arrayProductos[i].getCodigo());
            }
            else{
                System.out.println("Falsa alarma para el código No. "+arrayProductos[i].getCodigo());
            }
            if(arrayProductos[i].getcBodega() > mayor){
                mayor = arrayProductos[i].getcBodega();
                pMen = arrayProductos[i];
            }
        }
        System.out.println("El código con mayor número de unidades en bodega es: "+pMen.getCodigo());
        System.out.println();
        System.out.println("Factura de compra-venta");
        System.out.print("Código del producto: ");
        int cp = Integer.parseInt(input.nextLine());
        System.out.print("Unidades: ");
        int uc = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            if(arrayProductos[i].getCodigo() == cp){
                System.out.println("Total a pagar, $"+arrayProductos[i].totalAPagar(uc));
            }
        }
    }
}