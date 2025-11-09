class Solution {
    public int[] singleNum(int[] arr) {
        // xorOfBoth will hold xor of the two unique numbers: xorOfBoth = x ^ y
        int xorOfBoth = 0;
        for (int num : arr) {
            xorOfBoth ^= num;
        }

        // Get rightmost set bit (distinguishing bit) of xorOfBoth.
        // This bit is different between the two unique numbers.
        int distinguishingBit = xorOfBoth & -xorOfBoth;

        // Use two accumulators to xor numbers partitioned by distinguishingBit
        int unique1 = 0, unique2 = 0;
        for (int num : arr) {
            if ((num & distinguishingBit) != 0) {
                // numbers with the distinguishing bit set
                unique1 ^= num;
            } else {
                // numbers with the distinguishing bit unset
                unique2 ^= num;
            }
        }

        // Return the two unique numbers in increasing order
        return unique1 < unique2 ? new int[]{unique1, unique2} : new int[]{unique2, unique1};
    }
}