package Day_099;
import java.util.Stack;
public class Solution_099 {
    static boolean isBalanced(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
            if("({[".indexOf(ch)>=0)st.push(ch);
            // Check if the current closing bracket matches the top of the stack
            // ASCII codes: '()' => 40 & 41 (diff 1), '{}' => 123 & 125 (diff 2), '[]' => 91 & 93 (diff 2)
            // So: Math.abs(top - current) should be <= 2 if matched
            else if(st.isEmpty() ||Math.abs(st.peek()-ch)>2)return false;
            // if it is matched pop the opening bracket
            else st.pop();
        }
        return st.isEmpty();
    }
}
