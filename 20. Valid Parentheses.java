class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char chr : s.toCharArray()) {
            switch(chr) {
                case '(': case '{': case '[':
                    stack.push(chr);
                break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                break;
                
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                break;
                
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                break;
            }
        }
        
        return stack.isEmpty();
    }
}