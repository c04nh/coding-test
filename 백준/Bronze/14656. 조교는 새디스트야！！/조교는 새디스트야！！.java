import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        for(int i = 1; i <= N; i++){
            int input = scan.nextInt();

            if(input != i) cnt++;
        }

        System.out.print(cnt);
    }
}



