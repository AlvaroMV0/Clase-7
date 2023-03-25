public class PrecioNoPositivo extends Exception{

    public PrecioNoPositivo(Carrito carrito, Producto[] arr){
        System.out.print("El descuento no pudo ser aplicado por que el carrito posee un precio nulo o negativo ");
        System.out.println("("+carrito.calcPrecio(arr)+")");
    }

}
