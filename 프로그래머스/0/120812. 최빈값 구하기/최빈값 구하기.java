import java.util.Arrays;

class Solution {
    public static int solution(int[] array) {
        int[] count = new int[1000];  // 문제 조건상 숫자 범위 제한 시 사용 가능 (예: 0~999)
        for (int num : array) {
            count[num]++;
        }

        int maxCount = 0;
        int mode = -1;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i;
            } else if (count[i] == maxCount && count[i] != 0) {
                mode = -1;  // 최빈값이 중복되면 -1
            }
        }

        return mode;
    }
}
