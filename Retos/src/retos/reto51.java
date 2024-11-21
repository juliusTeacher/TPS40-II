package retos;

//Subclase: Prenda
public class reto51 extends reto5 { //public class Prenda extends Producto
    private String talla;
    private boolean planchado;

    public reto51(String talla, boolean planchado, int codigo, String descripcion, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida) {
        super(codigo, descripcion, pCompra, pVenta, cBodega, cMinRequerida, cMaxPermitida);
        this.talla = talla;
        this.planchado = planchado;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPlanchado() {
        return planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }   
    
}