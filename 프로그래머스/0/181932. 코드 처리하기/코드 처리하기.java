class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            switch(mode){
                case 0:
                    if(code.charAt(i) != '1'){
                        if(i % 2 == 0) answer += code.charAt(i);
                    }else mode = 1;
                    break;
                case 1:
                    if(code.charAt(i) != '1'){
                        if(i % 2 == 1) answer += code.charAt(i);
                    }else mode = 0;
                    break;
            }
        }
        
        if(answer == "") answer = "EMPTY";
        
        return answer;
    }
}