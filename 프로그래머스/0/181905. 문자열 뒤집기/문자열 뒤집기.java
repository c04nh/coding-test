class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        String reverse = "";
        
        for(int i = s; i <= e; i++){
            reverse = my_string.charAt(i) + reverse;
        }
        
        answer += reverse;
        answer += my_string.substring(e+1);
        
        return answer;
    }
}