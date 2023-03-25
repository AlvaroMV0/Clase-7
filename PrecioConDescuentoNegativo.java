public class PrecioConDescuentoNegativo extends Exception{

    public PrecioConDescuentoNegativo(Carrito carrito, Producto[] arr, descuentoFijo desc){
        System.out.print("El descuento no pudo ser aplicado por que el precio del carrito post aplicar el descuento es negativo.");
        System.out.println(desc.precioFinalConDescuento(carrito.calcPrecio((Producto[]) arr)));
    }
    public PrecioConDescuentoNegativo(Carrito carrito, Producto[] arr, descuentoPorcentaje desc){
        System.out.print("El descuento no pudo ser aplicado por que el precio del carrito post aplicar el descuento es negativo.");
        System.out.println(desc.precioFinalConDescuento(carrito.calcPrecio((Producto[]) arr)));
    }
    public PrecioConDescuentoNegativo(Carrito carrito, Producto[] arr, descuentoPorcentajeConTope desc){
        System.out.print("El descuento no pudo ser aplicado por que el precio del carrito post aplicar el descuento es negativo.");
        System.out.println(desc.precioFinalConDescuento(carrito.calcPrecio((Producto[]) arr)));
    }

}
