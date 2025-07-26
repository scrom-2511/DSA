import java.util.Arrays;
class Hashing_1 {
    //NUMBER HASHING
    public static int minAndMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] hashNum(int[] arr){
        int len = minAndMax(arr);
        int[] hashArr = new int[len+1];
        for (int i = 0; i < len; i++){
            hashArr[i] = 0;
        }
        for (int i=0; i< arr.length; i++){
            int num = arr[i];
            hashArr[num] += 1;
        }
        return hashArr;
    }
    
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,2,6};
        int[] freqArr = hashNum(arr);
        System.out.println(Arrays.toString(freqArr));
    }
}