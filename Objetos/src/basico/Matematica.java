package basico;

public class Matematica {
    
    //Declaración de atributos
    float a, b;
    
    //Creación de los métodos para realizar operaciones
    public float suma(float a, float b){
        return a + b;
    }
    
    public float resta(float a, float b){
        return a - b;
    }
    
    public float multiplicacion(float a, float b){
        return a * b;
    }
    
    public float division(float a, float b){
        if(b == 0){
            System.out.println("Error");
        }
        else{
            return a / b;
        }
        return 0;
    }
    
}
