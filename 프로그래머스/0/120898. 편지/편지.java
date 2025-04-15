public class Solution {
    public int solution(String message) {
        // 각 글자가 2cm를 차지하므로 전체 글자 수에 2를 곱한다.
        return message.length() * 2;
    }
}