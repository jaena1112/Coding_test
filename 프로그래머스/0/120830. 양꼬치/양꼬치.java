class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int sheep = k - service;
        return (n * 12000) + (sheep * 2000);
    }
}
