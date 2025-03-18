import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = 1;
        int b = 2;
        
        if(N > 1){
            for(int i = 2; i <= N; i++){
                int temp = a;
                a = b;
                b += temp;
            }
        }
        
        System.out.print(a);
    }
}