import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int answer = 0;
        
        for(int i = 1; i <= N; i++){
            int sum = 0;
            int num = i;
            while(num > 0){
                sum += num % 10;
                num = num / 10;
            }

            if(sum + i == N){
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
    }
}