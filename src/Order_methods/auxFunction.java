package Order_methods;

import java.util.Random;

public class auxFunction {
    public static int[] crearLista(int cantidad){
        int lista[] = new int[cantidad];
        Random random = new Random();

        for(int i=0; i<cantidad;i++){
            int randomInt = random.nextInt(100);
            lista[i] = randomInt;
        }
        return lista;
    }
    public static void mostrarLista(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print("["+list[i]+"]");
        }
        System.out.print("\n");
    }
}
