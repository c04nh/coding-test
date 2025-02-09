import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        int N = scan.nextInt();
        int answer = 0;
        int cnt = num.length() - 1;

        for(int i = 0; i < num.length(); i++){
            int a = 1;
            if(num.charAt(i) >= 65) a *= (num.charAt(i) - 55);
            else a *= (num.charAt(i) - 48);
            
            for(int j = 0; j < cnt; j++){
                a *= N;
            }

            cnt--;

            answer += a;

        }

        System.out.print(answer);
        
    }
}