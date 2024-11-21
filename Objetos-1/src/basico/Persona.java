package basico;

/*
    Se requiere un programa que modele concepto de una persona. 
    Una persona posee nombre, apellido, número de documento de identidad y año de nacimiento. 
    La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
    La clase debe incluir los siguientes métodos:
     Definir un método que imprima en pantalla los valores de los atributos del objeto.
     En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.
*/

public class Persona {
    
    //Declarar los atributos de la clase: Nombre, Apellido, No. de documento, año
    String nombre;
    String apellido;
    String identificacion;
    int anio;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String identificacion, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.anio = anio;
    }
    
    //Método para imprimir los atributos del objeto en pantalla
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido);
        System.out.println("No. de documento: "+identificacion);
        System.out.println("Año de nacimiento: "+anio);
    }
}