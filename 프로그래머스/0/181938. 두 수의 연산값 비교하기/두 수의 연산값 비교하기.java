class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int num2 = 2 * a * b;
        
        if(num1 > num2){
            answer = num1;
        }else{
            answer = num2;
        }
        return answer;
    }
}