package retos;

/*
    Reto 3.
    Implementar una clase PRODUCTO, la cual entrega los siguientes atributos y métodos:

    Atributos:
    * Código
    * Precio de compra
    * Cantidad en bodega
    * Cantidad mínima requerida en la bodega
    * Cantidad máxima de inventario permitida - NUEVO
    * Porcentaje de descuento - NUEVO

    Métodos:
    * Solicitar pedido: Devuelve TRUE si debe solicitar producto al proveedor y FALSE en caso contrario.
    * Calcular total a pagar: Devuelva la cantidad total a pagar al proveedor dado una cantidad de unidades
      de compra.

    Diseñar un programa que:
    * Consulte el números de productos a manejar.
    * Cree un vector de productos en el cual se guardarán las instancias de cada uno de ellos.
    * Solicite por consola el código del producto, el precio de compra, la cantidad en bodega y la cantidad mínima requerida
      de cada uno de los productos a manejar.
    * Recorra el vector de productos y arroje una alerta en caso tal se deba solicitar el pedido al proveedor.
    * Indique cuál es el código del producto que tiene menor cantidad de unidades en bodega, si hay varios que
      cumplen con la condición, indicar el primero de ellos.
    * Leer un código de producto y una cantidad de unidades compra, indicar el total a pagar por ese pedido.
      Para ello utilice el método creado en la clase Producto pasando por parámetro la cantidad de unidades
      de compra.
 
*/
public class reto3 {
    
    private int codigo; 
    private int pCompra; 
    private int cBodega; 
    private int cMinRequerida;
    private int cMaxPermitida;
    static double pDescuento = 0.01;

    public reto3(int codigo, int pCompra, int cBodega, int cMinRequerida, int cMaxPermitida) {
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
        this.cMaxPermitida = cMaxPermitida;
    }
    
    public boolean solicitarPedido(){
        return cBodega < cMinRequerida;
    }
    
    public int totalAPagar(int unidades){
        return unidades * pCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getpCompra() {
        return pCompra;
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int getcBodega() {
        return cBodega;
    }

    public void setcBodega(int cBodega) {
        this.cBodega = cBodega;
    }

    public int getcMinRequerida() {
        return cMinRequerida;
    }

    public void setcMinRequerida(int cMinRequerida) {
        this.cMinRequerida = cMinRequerida;
    }

    public int getcMaxPermitida() {
        return cMaxPermitida;
    }

    public void setcMaxPermitida(int cMaxPermitida) {
        this.cMaxPermitida = cMaxPermitida;
    }
    
    
    
    
    
}
