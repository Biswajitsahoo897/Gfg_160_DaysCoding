class Solution {
    public double power(double b, int e) {
        if (e == 0) return 1.0;
        if (e < 0) return 1.0 / power(b, -e);
        double half = power(b, e / 2);
        if (e % 2 == 0) return half * half;
        else return b * half * half;
    }
}