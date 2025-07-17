import java.util.*;

class Solution {
    static String decodeString(String s) {
        Stack<Integer> numSt = new Stack<>();
        Stack<String> charSt = new Stack<>();

        int n = 0;
        String curr = "";
        // to store the current string segment
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                charSt.push(curr);
                numSt.push(n);

                curr = "";
                n = 0;
            } else if (c == ']') {
                String temp = curr;
                curr = charSt.pop();
                curr += temp.repeat(numSt.pop());
            } else {
                curr += c;
            }
        }
        return curr;

    }
}