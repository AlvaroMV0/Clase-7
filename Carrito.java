
public class Carrito {

    String propietario;
     Producto[] arr;


    public Carrito(){

    }
    public  Carrito (Persona propietario){
            this.propietario = String.valueOf(propietario);
        }
        public float calcPrecio(Producto[] array){
        float sum = 0;
        for (Producto y : array){
            sum += Producto.getPrecioP(y);
        }
            return sum;
    }
}
