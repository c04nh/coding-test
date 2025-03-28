import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String s = String.valueOf(i);
            Boolean bool = true;
            
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) != '0' && s.charAt(j) != '5') bool = false;
            }
            
            if(bool) arr.add(i);
        }
        
        if(arr.size() == 0){
            arr.add(-1);
        }
        
        int[] answer = new int[arr.size()];
            
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}