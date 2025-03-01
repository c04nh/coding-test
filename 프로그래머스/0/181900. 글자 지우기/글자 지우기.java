import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int[] cnt = new int[my_string.length()];
        Arrays.fill(cnt, 0);
        
        for(int i = 0; i < indices.length; i++){
            cnt[indices[i]]++;
        }
        
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == 0) answer += my_string.charAt(i);
        }
        
        return answer;
    }
}