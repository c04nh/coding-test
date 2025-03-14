import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        boolean chk = false;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2) arrList.add(i);
        }
        
        if(arrList.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arrList.get(arrList.size()-1) - arrList.get(0) + 1];
        
        int index = 0;
        for(int i = arrList.get(0); i <= arrList.get(arrList.size()-1); i++){
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
    }
}