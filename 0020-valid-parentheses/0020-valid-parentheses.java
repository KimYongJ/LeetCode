import java.util.HashMap;
class Solution {
    public HashMap<Character,Character> hm = new HashMap<>(){
        {
            put(')','(');
            put('}','{');
            put(']','[');
        }
    };
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else if(st.isEmpty() || st.pop() != hm.get(c)){
                return false;
            }
                
        }
        return st.isEmpty();
    }
}