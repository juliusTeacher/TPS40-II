package algoritmos;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        while(num <= 100){
            if(num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
    
}
