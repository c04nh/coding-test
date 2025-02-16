class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x12 = x1 || x2;
        boolean x34 = x3 || x4;
        answer = x12 && x34;
        
        return answer;
    }
}