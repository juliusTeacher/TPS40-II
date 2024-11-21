package basico;

public class Persona {
    
    String nombre, apellido, docIdentificacion;
    int anioNacimiento;
    
    //Método constructor
    public Persona(){
        nombre = "";
        apellido = "";
        docIdentificacion = "";
        anioNacimiento = 0;
    }
    
    public Persona(String nombre, String apellido, String docIdentificacion, int anioNaciemiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.docIdentificacion = docIdentificacion;
        this.anioNacimiento = anioNaciemiento;    
    }
    
    //Método para imprimir los datos en pantalla
    public void imprimirPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Identificación: "+docIdentificacion);
        System.out.println("Año de nacimiento: "+anioNacimiento);
    }
}
