package encapsulamiento;
/*
    Crea una clase cuenta con los métodos ingreso, reintegro y transferencia. La clase contendrá un constructor por defecto,
    un constructor con parámetros, un constructor copia y los métodos getters y setters.
*/
public class Cuenta {
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    
    /* Constructor por defecto */
    public Cuenta(){
        
    }
    
    /* Constructor por parámetros */
    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    /* Constructor copia */
    public Cuenta(final Cuenta c){
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /* Método ingreso */
    public boolean ingreso(double importe){
        if(importe > 0){
            this.saldo += importe;
            return true;
        }
        return false;
    }
    
    /* Método reintegro */
    public boolean reintegro(double importe){
        if(importe > 0 && this.saldo >= importe){
            this.saldo -= importe;
            return true;
        }
        return false;
    }
    
    /* Método transferencia */ 
    public boolean transferencia(Cuenta c, double importe){
        if(this.reintegro(importe)){
            c.ingreso(importe);
            return true;
        }
        return false;
    }
}
