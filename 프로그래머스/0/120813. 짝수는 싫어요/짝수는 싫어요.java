import java.util.*;

class Solution {
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) { // 1부터 n까지 홀수만
            list.add(i);
        }

        // 리스트를 배열로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }
}
