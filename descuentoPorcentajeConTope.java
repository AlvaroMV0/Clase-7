public class descuentoPorcentajeConTope extends descuento{

    float valorTope;

    public void setValorTope(float valorTope) {
        this.valorTope = valorTope;
    }

    @Override
    public float obtenerDescuento(float valorBase) {

        return Math.min(getValorDes() * valorBase, valorTope);
        //devuelva el menor entre el descuento aplicado y el tope máximo

    }

    @Override
    public float precioFinalConDescuento(float valorBase) {

        return valorBase - this.obtenerDescuento(valorBase);

        /*if(getValorDes()>1){
            return 0;
        } else return valorBase - this.obtenerDescuento(valorBase);
        * */
    }
}
