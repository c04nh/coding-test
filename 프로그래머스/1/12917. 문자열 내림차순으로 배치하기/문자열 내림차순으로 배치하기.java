import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        
        Arrays.sort(ch);
        
        for(char c : ch){
            answer = c + answer;
        }
                
        return answer;
    }
}