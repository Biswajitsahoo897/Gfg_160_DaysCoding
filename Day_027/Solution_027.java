package Day_027;
// import java.util.Arrays;
class Solution {
    private int nextGap(int gap) {
        return (gap <= 1) ? 0 : (gap / 2) + (gap % 2);
    }
    public void mergeArrays(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int gap = n + m;

        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            int i, j;
            for (i = 0; i + gap < n; i++) {
                if (a[i] > a[i + gap]) {
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = temp;
                }
            }
            for (j = (gap > n ? gap - n : 0); i < n && j < m; i++, j++) {
                if (a[i] > b[j]) {
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
            }
            for (j = 0; j + gap < m; j++) {
                if (b[j] > b[j + gap]) {
                    int temp = b[j];
                    b[j] = b[j + gap];
                    b[j + gap] = temp;
                }
            }
        }
    }
}