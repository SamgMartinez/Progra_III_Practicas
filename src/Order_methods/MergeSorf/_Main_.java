package Order_methods.MergeSorf;
import Order_methods.auxFunction;
import Order_methods.Crono;
public class _Main_ {

    public static void main(String[] args) {
        Crono crono = new Crono();
        int vectorDesordenado[] = auxFunction.crearLista(100000);
        //mostrarLista(vectorDesordenado);
        int vectorOrdenador[] = MergeSorf.mergeSorf(vectorDesordenado, 0, vectorDesordenado.length - 1);
        //mostrarLista(vectorOrdenador);
        crono.end();
    }

    //  Resultados de pruebas //
    // cant = 100 -> 0.000 seconds
    // cant = 1000 -> 0.000 seconds
    // cant = 10000-> 0.101 seconds /3
    // cant = 50000 -> 1.038 seconds /5
    // cant = 100000 -> 3.001 seconds
    // cant = 500000 -> sin respuesta
}
