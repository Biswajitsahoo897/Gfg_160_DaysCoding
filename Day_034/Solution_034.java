import java.util.Arrays;
class Solution_034 {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low < high) {
            int mid = (low + high) / 2;
            int students = 1, sum = 0;

            for (int pages : arr) {
                if ((sum + pages) > mid) {
                    students++;
                    sum = pages;
                } else {
                    sum += pages;
                }
            }

            if (students > k) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}