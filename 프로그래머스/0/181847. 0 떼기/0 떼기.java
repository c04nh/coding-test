class Solution {
    public String solution(String n_str) {
        String answer = "";
        int index = -1;
        
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) == '0') index = i;
            else break;
        }
        
        for(int i = index+1; i < n_str.length(); i++){
            answer += n_str.charAt(i);
        }
        
        return answer;
    }
}