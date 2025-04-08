package Order_methods.MergeSorf;

import java.util.List;

public class MergeSorf {
    public List mergeSorf(List list, int init, int end){
        int mid = (init + end)/2;
        if (init < end){
            mergeSorf(list, init, mid);
            mergeSorf(list, mid + 1, end);
        }

        return list;
    }

    private static List merge(List list, int init, int end, int mid){

        return list;
    }
}
