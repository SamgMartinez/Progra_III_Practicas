package Order_methods.MergeSorf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _Main_ {
    private static List crearLista(int cantidad){
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for(int i=1; i<cantidad;i++){
            int randomInt = random.nextInt(100);
            lista.add(randomInt);
        }
        return lista;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> vectorDesordenado = crearLista(100);
        int x = 3;
        int y = 2;
        System.out.println(x/y);

        //  Ini Area para medir el tiempo   //
        long endTime = System.currentTimeMillis();
        double elapsedTimeInSeconds = (endTime - startTime) / 1000.0;
        System.out.println("Execution time: " + elapsedTimeInSeconds + " seconds");
        //  End APMET    //
    }
}
