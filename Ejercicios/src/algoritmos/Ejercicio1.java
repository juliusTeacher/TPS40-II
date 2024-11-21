package algoritmos;
import java.util.Scanner;
import java.text.DecimalFormat;

/*  Indice de Masa Corporal = peso / (altura)^2 
    Peso bajo -> < 18.5
    Peso normal -> 18.5 - 24.9
    Sobrepeso -> 25 - 29.9
    Obesidad -> > 30
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat numero = new DecimalFormat("#.##");
        double peso, altura, imc;
        System.out.print("Ingrese su peso (kg): ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese su altura (mts): ");
        altura = Double.parseDouble(input.nextLine());
        imc = peso / Math.pow(altura, 2);
        System.out.println("IMC = "+numero.format(imc));
        //System.out.println("IMC = "+imc);
        if(imc < 18.5){
            System.out.println("Peso bajo");
        }
        else if(imc >= 18.5 && imc < 24.9){
            System.out.println("Peso normal");
        }
        else if(imc >= 25 && imc < 29.9){
            System.out.println("Sobrepeso");
        }
        else{
            System.out.println("Obesidad");
        }
    }
}