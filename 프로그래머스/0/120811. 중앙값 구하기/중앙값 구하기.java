import java.util.Arrays;

class Solution {
    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
