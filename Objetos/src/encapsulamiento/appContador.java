package encapsulamiento;
import java.util.Scanner;

public class appContador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Contador c1 = new Contador();
        System.out.print("Ingrese el valor para inicializar el contador: ");
        int n = Integer.parseInt(input.nextLine());
        
        //asignar un valor al contador
        c1.setCont(n);
        
        //Incrementa el contador
        c1.incrementar();
        
        //Valor actual del contador
        System.out.println(c1.getCont());
        
        c1.incrementar();
        c1.incrementar();
        
        //Actualización del contador
        System.out.println(c1.getCont());
        
        //Decrementar el contador
        c1.decrementar();
        
        //Actualización del contado
        System.out.println(c1.getCont());
        
        Contador c2 = new Contador(10);
        c2.incrementar();
        System.out.println(c2.getCont());
        c2.decrementar();
        System.out.println(c2.getCont());
        
        Contador c3 = new Contador(c2);
        System.out.println(c3.getCont());
        
        
    }
    
}
