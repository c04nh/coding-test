import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int B = scan.nextInt();
        int a = N;
        int b = 0;
        String answer = "";

        while(a > 0){
            b = a % B;
            a = a / B;
            
            if(b >= 10) answer = String.valueOf((char)(b + 55)) + answer;
            else answer = String.valueOf(b) + answer;
        }

        System.out.print(answer);
        
    }
}