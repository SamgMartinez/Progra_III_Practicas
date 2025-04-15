package Order_methods.MergeSorf;

import java.util.List;

public class MergeSorf {
    public static int[] mergeSorf(int[] list, int init, int end){
        if (init == end){
            return list;
        }
        int mid = (init + end)/2; //O(1)
        if (init < end){
            mergeSorf(list, init, mid);
            mergeSorf(list, mid + 1, end);
        }
        merge(list,init,end,mid); //O(n)
        return list;
    }

    private static int[] merge(int[] list, int init, int end, int mid){
        int index1 = init, index2 = mid + 1; //O(1)
        int listaux[]  = new int[list.length];//O(1)
        for (int i = init ; i <= end; i++){//O(n)
            if (index1 > mid) {
                listaux[i] = list[index2];
                index2++;
            }else if(index2 > end){
                    listaux[i] = list[index1];
                    index1++;
            }else if(list[index1] < list[index2]){
                listaux[i] = list[index1];
                index1++;
            }else {
                listaux[i] = list[index2];
                index2++;
            }
        }
        for (int i = init ; i <= end; i++){//O(n)
            list[i] = listaux[i];
        }

        return list;
    }
}
