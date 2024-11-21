package modelo;

public class Aprendices {
    
    private int aprendizId;
    private String nombre;
    private String direccion;
    private String email;

    public Aprendices() {
    }

    public Aprendices(int aprendizId, String nombre, String direccion, String email) {
        this.aprendizId = aprendizId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public int getAprendizId() {
        return aprendizId;
    }

    public void setAprendizId(int aprendizId) {
        this.aprendizId = aprendizId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}