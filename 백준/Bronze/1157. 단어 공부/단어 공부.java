import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();
        int[] alphabet = new int[26];
        char answer;
        List<Integer> maxAlphabet = new ArrayList<>();
        
        Arrays.fill(alphabet, 0);

        for(int i = 0; i < str.length(); i++){
            alphabet[str.charAt(i)-65]++;
        }

        maxAlphabet.add(0);

        for(int i = 1; i < 26; i++){
            if(alphabet[maxAlphabet.get(0)] < alphabet[i]){
                maxAlphabet.clear();
                maxAlphabet.add(i);
            }else if(alphabet[maxAlphabet.get(0)] == alphabet[i]){
                maxAlphabet.add(i);
            }
        }

        if(maxAlphabet.size() > 1){
            answer = '?';
        } else{
            answer = (char)(maxAlphabet.get(0) + 65);
        }
        
        System.out.print(answer);
        
    }
}