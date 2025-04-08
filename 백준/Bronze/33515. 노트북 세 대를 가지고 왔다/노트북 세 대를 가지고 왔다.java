import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T1 = scan.nextInt();
        int T2 = scan.nextInt();
        
        if(T1 < T2) System.out.print(T1);
        else System.out.print(T2);
    }
}