import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double answer = Math.pow(2, N);
    
        System.out.print((int)answer);
    }
}