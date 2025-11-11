class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true){
            if(n / (answer+1) > 0){
                n /= (answer+1);
                answer++;
            }else break;
        }
        
        
        return answer;
    }
}