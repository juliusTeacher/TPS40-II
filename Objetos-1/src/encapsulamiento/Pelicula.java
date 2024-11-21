package encapsulamiento;

/*
    Realizar un programa en Java que defina una clase Película con los siguientes atributos privados:
     Nombre: es el nombre de la película y es de tipo String.
     Director: representa el nombre del director de la película y es de tipo String.
     Género: es el género de la película, un tipo enumerado con los siguientes valores: ACCION, COMEDIA, DRAMA y SUSPENSO.
     Duración: duración de la película en minutos, esta es de tipo int.
     Año: representa el año de realización de la película.
     Calificación: es la valoración de la película por parte de sus usuarios y es de tipo double.
    Se debe definir un constructor público para la clase, que recibe como parámetros los valores de todos sus atributos. 
    También se deben definir los siguientes métodos:
         Métodos get y set para cada atributo y con los derechos de acceso privados para los set y públicos para los get.
         Un método imprimir público que muestre en pantalla los valores de los atributos.
         Un método privado boolean esPeliculaEpica(), el cual devuelve un valor verdadero si la duración es mayor o igual 
          a tres horas, en caso contrario devuelve falso.
         Un método privado String calcularValoracion(), el cual según la tabla devuelve una valoración subjetiva:
          Calificación  Valoración
          [0,2]         Muy mala
          [2,5]         Mala
          [5,7]         Regular
          [7,9]         Buena
          [8,10]        Excelente
*/
public class Pelicula {
    
    private String nombre;
    private String director;
    public enum tipo{ACCION, COMEDIA, DRAMA, SUSPENSO}
    tipo genero;
    private int duracion;
    private int year;
    private double calificacion;    

    public Pelicula(String nombre, String director, tipo genero, int duracion, int year, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.year = year;
        this.calificacion = calificacion;
    }

    //Getter: publico, Setter: privado
    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public tipo getGenero() {
        return genero;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public int getYear() {
        return year;
    }

    private double getCalificacion() {
        return calificacion;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(tipo genero) {
        this.genero = genero;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    //Métodos
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Director: "+director);
        System.out.println("Género: "+genero);
        System.out.println("Duración: "+duracion);
        System.out.println("Año: "+year);
        System.out.println("Calificación: "+calificacion);
    }
    
    public boolean esPeliculaEpica(){
        if(duracion >= 180){
            return true;
        }
        else{
            return false;
        }
    }
    
    private String calcularValoracion(){
        String cal = String.valueOf(calificacion);
        switch (cal) {
            case "0","1"-> {
                return "Muy mala";
            }
            case "2","3","4","5" ->{
                return "Mala";
            }
            case "6","7" ->{
                return "Regular";
            }
            case "8","9" ->{
                return "Buena";
            }
            case "10" ->{
                return "Excelente";
            }
            default -> {
                return "No tiene asignada una valoración válida";
            }
        }
    }
    
    //Metodo para establecer si dos peliculas son similares si ambas son del mismo genero y si tienen
    //la misma valoración
    public boolean esSimilar(Pelicula pelicula){
        if(pelicula.genero == genero && pelicula.calcularValoracion() == calcularValoracion()){
            return true;
        }
        else{
            return false;
        }
    }
}