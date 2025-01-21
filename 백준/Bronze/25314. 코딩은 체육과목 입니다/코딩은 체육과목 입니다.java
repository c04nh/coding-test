import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = N / 4;
        
        if(N % 4 != 0){
            cnt++;
        }
        
        for(int i = 0; i < cnt; i++){
            System.out.print("long ");
        }
        
        System.out.print("int");
    }
}