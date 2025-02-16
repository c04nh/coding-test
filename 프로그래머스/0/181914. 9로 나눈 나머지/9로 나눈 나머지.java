class Solution {
    public int solution(String number) {
        int answer;
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++){
            sum += (int)(number.charAt(i)) - '0';
        }
        
        answer = sum % 9;
    
        return answer;
    }
}