import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        if(N * 100 >= M) System.out.print("Yes");
        else System.out.print("No");
    }
}