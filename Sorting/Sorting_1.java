import java.util.Arrays;
class Sorting_1 {
    //Selection Sort
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}