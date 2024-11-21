package retos;
/*
    Reto 2.
    Implementar una clase PRODUCTO, la cual entrega los siguientes atributos y métodos:

    Atributos:
    * Código
    * Precio de compra
    * Cantidad en bodega
    * Cantidad mínima requerida en la bodega

    Métodos:
    * Solicitar pedido: Devuelve TRUE si debe solicitar producto al proveedor y FALSE en caso contrario.

    Diseñar un programa que:
    * Consulte el números de productos a manejar.
    * Cree un vector de productos en el cual se guardarán las instancias de cada uno de ellos.
    * Solicite por consola el código del producto, el precio de compra, la cantidad en bodega y la cantidad mínima requerida
      de cada uno de los productos a manejar.
    * Recorra el vector de productos y arroje una alerta en caso tal se deba solicitar el pedido al proveedor.
    * Indique cuál es el código del producto que tiene menor cantidad de unidades en bodega, si hay varios que
      cumplen con la condición, indicar el primero de ellos.
 
*/
public class reto2 {
    
    private int codigo; 
    private int pCompra; 
    private int cBodega; 
    private int cMinRequerida;
    
    public reto2(int codigo, int pCompra, int cBodega, int cMinRequerida){
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
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
    
    public boolean solicitarPedido(){
        if(cBodega < cMinRequerida){
            return true;
        }
        else{
            return false;
        }
    }
    
}
