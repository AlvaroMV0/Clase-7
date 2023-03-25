public class descuentoFijo extends descuento{


    @Override
    public float obtenerDescuento(float valorBase) {
        return getValorDes();
    }

    @Override
    public float precioFinalConDescuento(float valorBase) {

        return valorBase - this.obtenerDescuento(valorBase);

        /*
        * if (getValorDes()>=valorBase){
            return 0;
        *} else return valorBase - this.obtenerDescuento(valorBase);
        * */

    }

}
