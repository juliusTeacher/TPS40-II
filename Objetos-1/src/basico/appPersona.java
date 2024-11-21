package basico;
import java.util.Scanner;

public class appPersona {
    public static void main(String[] args) {
        /*Persona p1 = new Persona("Rafael", "Mesino", "1045789321", 30);
        Persona p2 = new Persona("Walter", "Arias", "1143521645", 23);
        System.out.println("Impresión de los objetos en pantalla: ");
        System.out.println("**************************************");
        p1.imprimir();
        p2.imprimir();
        System.out.println("**************************************");*/
        
        Scanner input = new Scanner(System.in);
        String nombres, apellidos, id;
        int age;
        System.out.println("Ingreso de los datos de una persona");
        System.out.print("Nombre: ");
        nombres = input.nextLine();
        System.out.print("Apellidos: ");
        apellidos = input.nextLine();
        System.out.print("No. de documento: ");
        id = input.nextLine();
        System.out.print("Edad: ");
        age = Integer.parseInt(input.nextLine());
        Persona p1 = new Persona(nombres, apellidos, id, age);
        Persona p2 = new Persona();
        System.out.print("Nombre: ");
        p2.nombre = input.nextLine();
        System.out.print("Apellidos: ");
        p2.apellido = input.nextLine();
        System.out.print("No. de documento: ");
        p2.identificacion = input.nextLine();
        System.out.print("Edad: ");
        p2.anio = Integer.parseInt(input.nextLine());
        System.out.println("Impresión de los objetos en pantalla: ");
        System.out.println("**************************************");
        p1.imprimir();
        p2.imprimir();
        System.out.println("**************************************");
        
    }
    
}
