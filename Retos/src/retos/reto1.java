package retos;
/*
    Reto 1.
    Implementar una clase PRODUCTO, la cual entrega los siguientes atributos y métodos:

    Atributos:
    * Código
    * Precio de compra
    * Cantidad en bodega
    * Cantidad mínima requerida en la bodega

    Métodos:
    * Solicitar pedido: Devuelve TRUE si debe solicitar producto al proveedor y FALSE en caso contrario.

    Diseñar un programa que:
    * Solicite por consola el código del producto, el precio de compra, la cantidad en bodega y la cantidad mínima requerida.
    * Instancie un producto dentro de la clase principal.
    * Arroje una alerta en caso dado tal se deba solicitar el pedido al proveedor.
*/
public class reto1 {
    int codigo, pCompra, cBodega, cMinRequerida;
    
    public reto1(int codigo, int pCompra, int cBodega, int cMinRequerida){
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.cBodega = cBodega;
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
