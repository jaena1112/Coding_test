class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1 * denom2 + numer2 * denom1;
        int den = denom1 * denom2;
        int gcd = gcd(num, den);
        return new int[]{num / gcd, den / gcd};
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
