class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);        
        String reverse = sb.reverse().toString(); 
        System.out.println("뒤집은 문자열: " + reverse);
        return reverse;
    }
}
