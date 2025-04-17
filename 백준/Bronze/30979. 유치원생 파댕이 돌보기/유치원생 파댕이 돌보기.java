import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            T -= scan.nextInt();
        }

        if(T > 0) System.out.print("Padaeng_i Cry");
        else System.out.print("Padaeng_i Happy");
    }
}