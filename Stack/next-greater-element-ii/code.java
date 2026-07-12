// https://leetcode.com/problems/next-greater-element-ii/
// https://takeuforward.org/data-structure/next-greater-element-2

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;
            
            while(!stack.isEmpty() && stack.peek() <= nums[idx]) {
                stack.pop();
            }

            if(i < n) {
                if(stack.isEmpty()) ans[i] = -1;
                else ans[i] = stack.peek();
            }

            stack.push(nums[idx]);
        }

        return ans;
    }
}
