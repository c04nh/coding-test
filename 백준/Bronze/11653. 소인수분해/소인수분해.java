import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        while(N > 1){
            for(int i = 2; i <= N; i++){
                if(N % i == 0){
                    System.out.println(i);
                    N /= i;
                    break;
                }
            }
        }
    }
}