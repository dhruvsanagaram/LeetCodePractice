//3/4/23 - Backspace String Compare - Stacks - Easy
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack_S = new Stack<Character>();
        Stack<Character> stack_T = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#'){
                stack_S.push(s.charAt(i));
            }
            else{
                if(!stack_S.isEmpty()){
                    stack_S.pop();
                }
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) != '#'){
                stack_T.push(t.charAt(i));
            }
            else{
                if(!stack_T.isEmpty()){
                    stack_T.pop();
                }
            }
        }

        if(!stack_S.equals(stack_T)){
            return false;
        }
        return true;

    }
}

