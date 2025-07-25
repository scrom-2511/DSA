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
    
    public static void isPalindrome(String str, int i){
        // if (i == str.length()-i-1 || i == str.length()-i){
        //     System.out.println("The string a palindrome.");
        // }
        if(i >= str.length()/2){
            System.out.println("The string a palindrome.");
        }else if (str.charAt(i) != str.charAt(str.length()-i-1)){
            System.out.println("The string is not a palindrome.");
        }else{
            isPalindrome(str, i+1);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArr(arr, 0, arr.length-1);
        
        isPalindrome("abccbaabccbaabccba", 0);
    }
}
