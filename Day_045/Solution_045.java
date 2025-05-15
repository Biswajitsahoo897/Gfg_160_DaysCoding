package Day_045;
import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        HashSet<Integer> setA = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : a) setA.add(num);

        for (int num : b) {
            if (setA.remove(num)) result.add(num);
        }

        return result;
    }
}