import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> arrList = new ArrayList<>();
        
        for(int i : arr){
            arrList.add(i);
        }
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                arrList = arrList.subList(0, query[i]+1);
            }else{
                arrList = arrList.subList(query[i], arrList.size());
            }
        }
        
        int[] answer = new int[arrList.size()];
        
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}