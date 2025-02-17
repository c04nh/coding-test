class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++){
            String str = "";
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                str = arr[j] + str;
            }
            
            char[] reverse = str.toCharArray();
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                arr[j] = reverse[j-queries[i][0]];
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}