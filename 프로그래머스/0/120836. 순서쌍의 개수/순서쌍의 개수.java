public class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++; // i는 n의 약수 => (i, n/i) 순서쌍 가능
            }
        }
        return count;
    }

    }

