class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        boolean ab = a == b;
        boolean ac = a == c;
        boolean bc = b == c;
        
        if((ab && ac) && bc){
            answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }else if((ab || ac) || bc){
            answer = (a + b + c) * (a*a + b*b + c*c);
        }else{
            answer = a + b + c;
        }
        return answer;
    }
}