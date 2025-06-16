import java.util.ArrayList;
class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean[] cols = new boolean[n];
        boolean[] d1 = new boolean[2 * n - 1]; // main diagonals
        boolean[] d2 = new boolean[2 * n - 1]; // anti-diagonals
        int[] row = new int[n];
        backtrack(0, n, row, cols, d1, d2, res);
        return res;
    }

    private void backtrack(int r, int n, int[] row, boolean[] cols, boolean[] d1, boolean[] d2, ArrayList<ArrayList<Integer>> res) {
        if (r == n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int c : row) temp.add(c + 1);
            res.add(temp);
            return;
        }
        for (int c = 0; c < n; c++) {
            int id1 = r - c + n - 1, id2 = r + c;
            if (!cols[c] && !d1[id1] && !d2[id2]) {
                row[r] = c;
                cols[c] = d1[id1] = d2[id2] = true;
                backtrack(r + 1, n, row, cols, d1, d2, res);
                cols[c] = d1[id1] = d2[id2] = false;
            }
        }
    }
}