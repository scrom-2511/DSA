import java.util.Arrays;
class Recursion_3 {
    
    //REVERSING AN ARRAY
    public static void reverseArr(int[] arr, int start, int end){
        if(start>=end){
            System.out.println(Arrays.toString(arr));
        }else{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArr(arr, start+1, end-1);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArr(arr, 0, arr.length-1);
    }
}
