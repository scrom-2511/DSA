// https://leetcode.com/problems/valid-parentheses/description/
// https://takeuforward.org/data-structure/check-for-balanced-parentheses/

class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2) return false;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.size() == 0) return false;
                char chPopped = stack.pop();
                if (ch == ')') {
                    if(chPopped != '(') return false;
                } else if (ch == ']') {
                    if(chPopped != '[') return false;
                } else if (ch == '}') {
                    if(chPopped != '{') return false;
                }
            }
        }

        if (stack.size() != 0) return false;

        return true;
    }
}
