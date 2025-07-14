package Day_105;
import java.util.*;
class Solution_105 {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    // Add an element to the top of Stack
    public void push(int x) {
        st.push(x);
        if(minStack.isEmpty()||x<=minStack.peek())
        {
            minStack.push(x);
        }
    }
    public void pop() {
        if(!st.isEmpty()){
            if(st.peek().equals(minStack.peek())){
                minStack.pop();
            }
            st.pop();
        }
        // code here
    }

    // Returns top element of the Stack
        
    public int peek() {
        // code here
        return st.isEmpty()?-1:st.peek();
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        return minStack.isEmpty()?-1:minStack.peek();
    }
}