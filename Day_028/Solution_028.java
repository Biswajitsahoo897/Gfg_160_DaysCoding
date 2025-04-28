class Solution {
    public int countFreq(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }

        if (low >= arr.length || arr[low] != target)
            return 0;

        int first = low;
        high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low + 1) / 2;
            if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid;
        }

        int last = high;
        return last - first + 1;
    }
}