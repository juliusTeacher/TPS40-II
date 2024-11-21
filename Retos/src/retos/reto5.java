package retos;
/*
    Reto 5.
    Implementar una clase PRODUCTO, la cual entrega los siguientes atributos y métodos:

    Atributos:
    * Código
    * Descripción - NUEVO
    * Precio de compra
    * Precio de venta
    * Cantidad en bodega
    * Cantidad mínima requerida en la bodega
    * Cantidad máxima de inventario permitida 
    * Porcentaje de descuento

    Métodos:
    * Solicitar pedido: Devuelve TRUE si debe solicitar producto al proveedor y FALSE en caso contrario.
    * Calcular total a pagar: Devuelva la cantidad total a pagar al proveedor dado una cantidad de unidades
      de compra.

    *** NUEVO ***
    Adicionalmente se desea dos subclases para los siguientes tipos de productos:
    * Prendas de vestir(como lo son blusas, jeans, camisas, etc) el cual debe tener los siguientes parámetros
      adicionales:
      ** Talla: S,M,L,etc.
      ** Permite planchado: F / V

    * Calzado (como lo son tenis, calzado, informal, sandalias, etc) el cual debe tener el siguiente parámetro
      adicional:
      ** Talla: 35, 36, 37, etc.


    Diseñar un programa que:
    * Consulte el número de productos de tipo de prendas de vestir a manejar.
    * Consulte el número de productos de tipo de calzado a manejar.
    * Cree un vector de productos de prendas de vestir en el cual se guardarán las instancias de c/u de ellos.
    * Cree un vector de productos de calzado en el cual se guardarán las instancias de c/u de ellos.
    * Solicite los datos requeridos para cada tipo de producto a guardar.

    Implemente en la clase principal un menú con las siguientes opciones:
    * Verificar los productos a pedir: recorrer las listas de productos y arrojar una alerta en caso dado se 
      deba solicitar el pedido al proveedor.
    * Calzado con mayor cantidad de unidades: indicar cuál es el código del producto que tiene mayor cantidad
      de unidades en bodega, si hay varios que cumplen con la condición, indicar el mayor de ellos.
    * Prendas con mayor cantidad de unidades: indicar cuál es el código del producto que tiene mayor cantidad
      de unidades en bodega, si hay varios que cumplen con la condición, indicar el mayor de ellos.
    * Modificar cantidad mínima requerida en bodega: leer código del producto, el tipo(calzado o prenda) y el nuevo
      valor para la cantidad de unidades mínimas requeridas, validar en el método set de la variable correspondiente
      que la nueva cantidad no sea menor a 0, en caso de serlo establecer la cantidad mínima como 0.
    * Vender producto: solicite el código de un producto a vender, el tipo(calzado o prenda), y las unidades correspondientes
      calcule el valor de la factura con descuento, y sin descuento. Validar que existan las unidades necesarias para la
      venta y modificar las unidades existentes después de la venta utilizando el método set de la variable correspondiente.
    
    Para tener en cuneta el porcentaje de descuento es el mismo para todos los productos, y es del 1%.
 
*/

public class reto5 {
    
    //Declaración de atributos: clase Producto
    private int codigo;
    private String descripcion;
    private int pCompra;
    private int pVenta;
    private int cBodega; 
    private int cMinRequerida;
    private int cMaxPermitida;
    static double pDescuento = 0.01;

    public reto5(int codigo, String descripcion, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
        this.cMaxPermitida = cMaxPermitida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getpCompra() {
        return pCompra;
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int getpVenta() {
        return pVenta;
    }

    public void setpVenta(int pVenta) {
        this.pVenta = pVenta;
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
        if(cMinRequerida < 0){
            this.cMinRequerida = 0;
        }
        else{
            this.cMinRequerida = cMinRequerida;
        }
        
    }

    public int getcMaxPermitida() {
        return cMaxPermitida;
    }

    public void setcMaxPermitida(int cMaxPermitida) {
        this.cMaxPermitida = cMaxPermitida;
    }
    
    public boolean solicitarPedido(){
        return cBodega < cMinRequerida;
    }
    
    public int totalAPagar(int unidades){
        return unidades * pCompra;
    }
    
}
