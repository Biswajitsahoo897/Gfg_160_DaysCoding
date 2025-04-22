package Day_022;
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n + 1];

        for (int c : citations) {
            if (c >= n)
                buckets[n]++;
            else
                buckets[c]++;
        }

        int cumulative = 0;
        for (int i = n; i >= 0; i--) {
            cumulative += buckets[i];
            if (cumulative >= i)
                return i;
        }
        return 0;
    }
}