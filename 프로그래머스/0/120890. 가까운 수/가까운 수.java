class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int temp;
        if(array[0] > n) temp = array[0] - n;
        else temp = n - array[0];
        
        for(int i = 1; i < array.length; i++){
            if(array[i] >= n){
                if(array[i] - n < temp){
                    temp = array[i] - n;
                    answer = array[i];
                }else if(array[i] - n == temp){
                    answer = Math.min(answer, array[i]);
                }
                
            }else if(array[i] < n){
                if(n - array[i] < temp){
                    temp = n - array[i];
                    answer = array[i];
                }else if(n - array[i] == temp){
                    answer = Math.min(answer, array[i]);
                }
            }
        }
        
        return answer;
    }
}