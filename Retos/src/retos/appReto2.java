package retos;
import java.util.Scanner;

public class appReto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        reto2 arrayProductos[] = new reto2[100]; //Creación de un array de objetos: lista
        int cod, valor, cantB, cMin;
        
        System.out.print("Cantidad de productos: ");
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
            
            arrayProductos[i] = new reto2(cod, valor, cantB, cMin);
        }
        int menor = 1000000;
        reto2 pMen = arrayProductos[0];
        for (int i = 0; i < n; i++) {
            if(arrayProductos[i].solicitarPedido()){
                System.out.println("Alerta generada para el código No. "+ arrayProductos[i].getCodigo());
            }
            else{
                System.out.println("Falsa alarma, no se requiere producto con código No. "+arrayProductos[i].getCodigo());
            }
            if(arrayProductos[i].getcBodega() < menor){
                menor = arrayProductos[i].getcBodega();
                pMen = arrayProductos[i];
            }
        }
        System.out.println("El código del producto con el menor número de unidades es: "+pMen.getCodigo());
    }
    
}
