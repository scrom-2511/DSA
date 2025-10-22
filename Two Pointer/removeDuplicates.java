class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length < 1) return 0;
        if (arr.length == 1) return 1;
        
        int left = 0, right = 1;
        while (right < arr.length){
            if(arr[left]!=arr[right]){
                left++;
                arr[left] = arr[right];
            }
            right++;
        }
        return left+1;
    }
}