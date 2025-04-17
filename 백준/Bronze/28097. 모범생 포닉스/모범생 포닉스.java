import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int time = 0;
        
        for(int i = 0; i < N; i++){
            time += scan.nextInt();
        }
        
        time += 8 * (N - 1);
        
        System.out.print((time / 24) + " " + (time % 24));
    }
}