package retos;
import java.util.Scanner;

public class appReto5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        reto5 arrayPrendas [] = new reto5[100];
        reto5 arrayCalzado [] = new reto5[100];
        
        int codigo, vCompra, vVenta, cantB, cMin, cMax, opc;
        String desc;
        
        System.out.print("Cantidad de prendas: ");
        int np = Integer.parseInt(input.nextLine());
        System.out.print("Cantidad de calzado: ");
        int nc = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < np; i++) {
            System.out.print("Código de la prenda: ");
            codigo = Integer.parseInt(input.nextLine());
            System.out.print("Descripción de la prenda: ");
            desc = input.nextLine();
            System.out.print("Precio de compra $");
            vCompra = Integer.parseInt(input.nextLine());
            System.out.print("Precio de venta $");
            vVenta = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad en bodega (unidades): ");
            cantB = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad mínima requerida en bodega (unidades): ");
            cMin = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad máxima permitida en bodega (unidades): ");
            cMax = Integer.parseInt(input.nextLine());
            
            arrayPrendas[i] = new reto5(codigo, desc, vCompra, vVenta, codigo, cMin, cMax);
        }
        
        for (int i = 0; i < nc; i++) {
            System.out.print("Código del calzado: ");
            codigo = Integer.parseInt(input.nextLine());
            System.out.print("Descripción del calzado: ");
            desc = input.nextLine();
            System.out.print("Precio de compra $");
            vCompra = Integer.parseInt(input.nextLine());
            System.out.print("Precio de venta $");
            vVenta = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad en bodega (unidades): ");
            cantB = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad mínima requerida en bodega (unidades): ");
            cMin = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad máxima permitida en bodega (unidades): ");
            cMax = Integer.parseInt(input.nextLine());
            
            arrayCalzado[i] = new reto5(codigo, desc, vCompra, vVenta, codigo, cMin, cMax);
        }
        
        //Menú de opciones
        System.out.println("Menú principal - TIENDA ALMACEN ABRAHAM AL-HUMOR");
        System.out.println("1 - Verificar productos a pedir (calzado y prendas de vestir)");
        System.out.println("2 - Calzado con mayor cantidad de unidades");
        System.out.println("3 - Prendas con mayor cantidad de unidades");
        System.out.println("4 - Modificar cantidad mínima requerida en la bodega");
        System.out.println("5 - Vender productos");
        System.out.print("Elija la opción a realizar: ");
        opc = Integer.parseInt(input.nextLine());
        switch (opc) {
            case 1 -> {
                for (int i = 0; i < nc; i++) {
                    if(arrayCalzado[i].solicitarPedido()){
                        System.out.println("Se necesita calzado con el código No."+arrayCalzado[i].getCodigo());
                    }
                    else{
                        System.out.println("En este momento no se necesita calzado.");
                    }
                }
                for (int i = 0; i < np; i++) {
                    if(arrayPrendas[i].solicitarPedido()){
                        System.out.println("Se necesita prendas de vestir con el código No."+arrayPrendas[i].getCodigo());
                    }
                    else{
                        System.out.println("En este momento no se necesita prendas de vestir");
                    }
                }
                break;
            }
            case 2->{
                int mayor = -1;
                reto5 pMen = arrayCalzado[0];
                for (int i = 0; i < nc; i++) {
                    if(arrayCalzado[i].getcBodega() > mayor){
                        mayor = arrayCalzado[i].getcBodega();
                        pMen = arrayCalzado[i];
                    }
                }
                System.out.println("El código del producto de calzado con el mayor número de unidades en bodega es: "+pMen.getCodigo());
                break;
            }
            case 3 ->{
                int mayorP = -1;
                reto5 pMenP = arrayPrendas[0];
                for (int i = 0; i < np; i++) {
                    if(arrayPrendas[i].getcBodega() > mayorP){
                        mayorP = arrayPrendas[i].getcBodega();
                        pMenP = arrayPrendas[i];
                    }
                }
                System.out.println("El código del producto de prendas con el mayor número de unidades en bodega es: "+pMenP.getCodigo());
                break;
            }
            case 4 ->{
                System.out.print("Código del producto: ");
                int cp = Integer.parseInt(input.nextLine());
                System.out.print("Tipo de producto: (C: calzado, P: prenda): ");
                String tipo = input.nextLine().toUpperCase();
                System.out.print("Defina la nueva cantidad mínima requerida en la bodega (unidades): ");
                int cmn = Integer.parseInt(input.nextLine());
                if(tipo.equalsIgnoreCase("C")){
                    for (int i = 0; i < nc; i++) {
                        if(arrayCalzado[i].getCodigo() == cp){
                            arrayCalzado[i].setcMinRequerida(cmn);
                        }
                    }
                }
                else{
                     for (int i = 0; i < np; i++) {
                        if(arrayPrendas[i].getCodigo() == cp){
                            arrayPrendas[i].setcMinRequerida(cmn);
                        }
                    }
                }
                break;
            }
            case 5->{
                int cp = 0, und=0;
                String tipo = "";
                System.out.print("Código del producto");
                cp = Integer.parseInt(input.nextLine());
                System.out.print("Tipo de producto: (C: calzado, P: prenda): ");
                tipo = input.nextLine().toUpperCase();
                System.out.print("Unidades a vender: ");
                und = Integer.parseInt(input.nextLine());
                if(tipo.equalsIgnoreCase("C")){
                    for (int i = 0; i < nc; i++) {
                        if(cp == arrayCalzado[i].getCodigo() && und <= arrayCalzado[i].getcBodega()){
                            double tvSD = und * arrayCalzado[i].getpVenta();
                            double tvCD = und * (arrayCalzado[i].getpVenta() * reto5.pDescuento);
                            System.out.println("Factura sin descuento, $"+tvSD);
                            System.out.println("Factura con descuento, $"+tvCD);
                            arrayCalzado[i].setcBodega(arrayCalzado[i].getcBodega()-und);
                        }
                    }
                }
                else{
                    for (int i = 0; i < np; i++) {
                        if(cp == arrayPrendas[i].getCodigo() && und <= arrayPrendas[i].getcBodega()){
                            double tvSD = und * arrayPrendas[i].getpVenta();
                            double tvCD = und * (arrayPrendas[i].getpVenta() * reto5.pDescuento);
                            System.out.println("Factura sin descuento, $"+tvSD);
                            System.out.println("Factura con descuento, $"+tvCD);
                            arrayPrendas[i].setcBodega(arrayPrendas[i].getcBodega()-und);
                        }
                    }
                }
                break;
            }
            default -> {
                System.out.println("Error, intente de nuevo!!");
            }
        }
        
        
        
        
    }
    
}
