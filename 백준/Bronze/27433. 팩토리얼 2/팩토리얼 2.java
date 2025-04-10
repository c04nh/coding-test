import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long answer = 1;
        
        for(int i = 1; i <= N; i++){
            answer *= i;
        }
        
        System.out.print(answer);
    }
}