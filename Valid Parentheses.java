//8/7/23 - Valid Parentheses - Stacks - Easy
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty() || map.get(s.charAt(i)) != stack.pop()){
                    return false;
                } 
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}

