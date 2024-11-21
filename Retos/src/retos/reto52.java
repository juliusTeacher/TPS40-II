package retos;

public class reto52 extends reto5{ //public class Calzado extends Producto
    private int talla;

    public reto52(int talla, int codigo, String descripcion, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida) {
        super(codigo, descripcion, pCompra, pVenta, cBodega, cMinRequerida, cMaxPermitida);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
}