package Order_methods.QuickSort;

public class QuickSort {
    public static int[] quickSorf(int[] list, int init, int end){

        if (init >= end){
            return list;
        }
        int pivot = orderListPivote(list, init, end);
        if(pivot > 0){
            quickSorf(list, init, pivot - 1);
        }
        if(pivot < list.length - 1){
            quickSorf(list,pivot + 1, end);
        }

        return list;
    }
    private static int orderListPivote(int[] list, int init, int end){
        int leftIndex = init, rightIndex = end - 1;
        while (leftIndex < rightIndex && list[leftIndex] < list[end]){
            leftIndex++;
        }
        while (rightIndex > leftIndex && list[rightIndex] >= list[end]){
            rightIndex--;
        }
        if(leftIndex < rightIndex) {
            int aux = list[leftIndex];
            list[leftIndex] = list[rightIndex];
            list[rightIndex] = aux;
        }else if(leftIndex > rightIndex){
            int aux = list[end];
            list[end] = list[leftIndex];
            list[leftIndex] = aux;
            return leftIndex;
        }
        while(leftIndex <= rightIndex){
            while (leftIndex < rightIndex && list[leftIndex] < list[end]){
                leftIndex++;
            }
            while (rightIndex > leftIndex && list[rightIndex] >= list[end]){
                rightIndex--;
            }
            if(leftIndex < rightIndex) {
                int aux = list[leftIndex];
                list[leftIndex] = list[rightIndex];
                list[rightIndex] = aux;
            }else if(leftIndex > rightIndex){
                int aux = list[end];
                list[end] = list[leftIndex];
                list[leftIndex] = aux;
                return leftIndex;
            }else{
                int aux = list[end];
                if(list[leftIndex] > list[end]){
                    list[end] = list[leftIndex];
                    list[leftIndex] = aux;
                    return leftIndex;
                }else{
                    list[end] = list[leftIndex + 1];
                    list[leftIndex + 1] = aux;
                    return leftIndex + 1;
                }
            }
        }
        return end;
    }
}
