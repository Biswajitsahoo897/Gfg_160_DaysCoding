package Day_015;
class Solution_015 {
    public String addBinary(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = n1 - 1, j = n2 - 1;
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += s1.charAt(i--) - '0';
            if (j >= 0) sum += s2.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        result.reverse();

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}


// U can also this solution for the same problem but u have to do the if-else part in a different way

// import java.io.*;

// // Class
// class GFG {

// 	// Method
// 	public static String addBinary(String x, String y)
// 	{
// 		int i = x.length() - 1, j = y.length() - 1;
// 		int carry = 0;
// 		StringBuilder result = new StringBuilder();
// 		while (i >= 0 || j >= 0) {
// 			int sum = carry;
// 			if (i >= 0) {
// 				sum += x.charAt(i) - '0';
// 			}
// 			if (j >= 0) {
// 				sum += y.charAt(j) - '0';
// 			}
// 			if (sum == 0 || sum == 1) {
// 				result.append(sum);
// 				carry = 0;
// 			}
// 			else if (sum == 2) {
// 				result.append("0");
// 				carry = 1;
// 			}
// 			else {
// 				result.append("1");
// 				carry = 1;
// 			}
// 			i--;
// 			j--;
// 		}
// 		if (carry == 1) {
// 			result.append("1");
// 		}
// 		return result.reverse().toString();
// 	}

// 	// Main driver method
// 	public static void main(String[] args)
// 	{
// 		String x = "011011";
// 		String y = "1010111";
	
// 		System.out.println(addBinary(x, y));
// 	}
// }
