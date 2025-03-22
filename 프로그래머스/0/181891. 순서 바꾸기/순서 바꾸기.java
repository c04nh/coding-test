import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            arrList1.add(num_list[i]);
        }
        
        for(int i = n; i < num_list.length; i++){
            arrList2.add(num_list[i]);
        }
        
        arrList2.addAll(arrList1);
        
        for(int i = 0; i < arrList2.size(); i++){
            answer[i] = arrList2.get(i);
        }
        
        return answer;
    }
}