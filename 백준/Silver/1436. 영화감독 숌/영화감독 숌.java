import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        for(int i = 666; i < 3000000; i++){
            if(String.valueOf(i).contains("666")) cnt++;
            if(cnt == N){
                System.out.print(i);
                break;
            }
        }        
    }
}