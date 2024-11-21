package encapsulamiento;

public class appPelicula {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("El Padrino", "Francis Ford-Coppola", Pelicula.tipo.DRAMA, 180, 1972, 9.8);
        Pelicula p2 = new Pelicula("Rocky", "John G. Avbidsen", Pelicula.tipo.ACCION, 122, 1976, 9.5);
        p1.imprimir();
        System.out.println();
        p2.imprimir();
        System.out.println();
        System.out.println("La película: "+p1.getNombre()+" es épica: "+p1.esPeliculaEpica());
        System.out.println("La película: "+p2.getNombre()+" es épica: "+p2.esPeliculaEpica());
        System.out.println("La película: "+p1.getNombre()+" y la película: "+p2.getNombre()+" son similares: "+p1.esSimilar(p2));
    }
    
}
