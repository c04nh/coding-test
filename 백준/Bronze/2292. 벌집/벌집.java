import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 1;
        int chk = 1;

        if(N > 1){
            while(chk < N){
                chk += 6 * cnt;
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}