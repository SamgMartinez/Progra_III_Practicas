package Order_methods.QuickSort;

import Order_methods.Crono;
import Order_methods.auxFunction;

public class _main_ {
    public static void main (String[] args){
        Crono crono = new Crono();
        int[] List = auxFunction.crearLista(100);
        auxFunction.mostrarLista(List);
        QuickSort.quickSorf(List, 0, List.length - 1);
        auxFunction.mostrarLista(List);
        crono.end();
    }
}
