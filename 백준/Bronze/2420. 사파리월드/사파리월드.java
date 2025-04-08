import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();
        
        long num = N - M;
        
        if(num < 0) System.out.print(num*(-1));
        else System.out.print(num);
    }
}