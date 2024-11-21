package basico;

public class Cuadratica {
    
    //Declaración de atributos
    private double a, b, c;

    public Cuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void ObtenerRaices(){
        double x1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        double x2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
        
        System.out.println("X1 = "+x1);
        System.out.println("X2 = "+x2);
    }
    
    private void ObtenerRaiz(){
        double x = -b/(2*a);
        
        System.out.println("Única solución = "+x);
    }
    
    private double getDiscriminante(){
        return Math.pow(b,2)-(4*a*c);
    }
    
    private boolean tieneRaices(){
        return getDiscriminante()>=0;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
    public void calcular(){
        if(tieneRaices()){
            ObtenerRaices();
        }
        else if(tieneRaiz()){
            ObtenerRaiz();
        }
        else{
            System.out.println("No tiene solución la ecuación cuadrática");
        }
    }
}
