import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> arrList = new ArrayList<>();
        
        for(int i : num_list){
            arrList.add(i);
        }
        
        arrList = arrList.subList(n-1, num_list.length);
        
        int[] answer = new int[arrList.size()];
        
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}