class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String strNum = Integer.toString(num);
        
        for(int i = 0; i < strNum.length(); i++){
            if((int)strNum.charAt(i)-48 == k){
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}