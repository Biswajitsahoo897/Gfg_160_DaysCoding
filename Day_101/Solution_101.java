import java.util.*;
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            res.add(-1);
        }
        // traverse the array from right to left
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            // If the stack is not empty, the top element is the next greater element
            if(!st.isEmpty()){
                res.set(i,st.peek());
            }
            // Then just push the current element into the stack
            st.push(arr[i]);
        }
        return res;
    }
}