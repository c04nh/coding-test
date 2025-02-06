import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = str.length();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '=' || str.charAt(i) == '-') answer--;
            if(i < str.length() - 2){
                if((str.charAt(i) == 'd' && str.charAt(i+1) == 'z') && str.charAt(i+2) == '=') answer--;
            }
            if(i < str.length() - 1){
                if(str.charAt(i) == 'l' && str.charAt(i+1) == 'j') answer--;
            if(str.charAt(i) == 'n' && str.charAt(i+1) == 'j') answer--;
            }
        }

        System.out.print(answer);
        
    }
}