package Order_methods.MergeSorf;
import java.util.Random;

public class _Main_ {
    private static int[] crearLista(int cantidad){
        int lista[] = new int[cantidad];
        Random random = new Random();

        for(int i=0; i<cantidad;i++){
            int randomInt = random.nextInt(100);
            lista[i] = randomInt;
        }
        return lista;
    }
    private static void mostrarLista(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print("["+list[i]+"]");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int vectorDesordenado[] = crearLista(500000);
        //mostrarLista(vectorDesordenado);
        int vectorOrdenador[] = MergeSorf.mergeSorf(vectorDesordenado, 0, vectorDesordenado.length - 1);
        //mostrarLista(vectorOrdenador);
        //  Ini Area para medir el tiempo   //
        long endTime = System.currentTimeMillis();
        double elapsedTimeInSeconds = (endTime - startTime) / 1000.0;
        System.out.println("Execution time: " + elapsedTimeInSeconds + " seconds");
        //  End APMET    //
    }

    //  Resultados de pruebas //
    // cant = 100 -> 0.000 seconds
    // cant = 1000 -> 0.000 seconds
    // cant = 10000-> 0.101 seconds /3
    // cant = 50000 -> 1.038 seconds /5
    // cant = 100000 -> 3.001 seconds
    // cant = 500000 -> sin respuesta
}
