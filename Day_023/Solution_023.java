package Day_023;
class Solution {
    private int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left, inversions = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversions += (mid - i + 1);
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return inversions;
    }

    private int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int inversions = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            inversions += mergeSortAndCount(arr, temp, left, mid);
            inversions += mergeSortAndCount(arr, temp, mid + 1, right);
            inversions += mergeAndCount(arr, temp, left, mid, right);
        }
        return inversions;
    }

    public int inversionCount(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }
}