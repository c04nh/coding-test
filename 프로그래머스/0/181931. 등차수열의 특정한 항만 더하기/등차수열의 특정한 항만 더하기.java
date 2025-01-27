class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;
        
        if(included[0]) answer += num;
        
        for(int i = 1; i < included.length; i++){
            num += d;
            if(included[i]) answer += num;
        }
        return answer;
    }
}