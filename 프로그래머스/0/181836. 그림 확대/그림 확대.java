class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < picture.length * k; i++){
            String pic = "";
            for(int j = 0; j < picture[i/k].length()*k; j++){
                pic += picture[i/k].charAt(j/k);
            }
            answer[i] = pic;
        }
        
        return answer;
    }
}