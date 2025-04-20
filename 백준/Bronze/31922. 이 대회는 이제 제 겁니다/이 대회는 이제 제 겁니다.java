import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int P = scan.nextInt();
        int C = scan.nextInt();
        
        if(A + C > P) System.out.print(A + C);
        else System.out.print(P);
        
    }
}