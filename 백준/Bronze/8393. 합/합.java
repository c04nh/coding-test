import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int answer = 0;
        
        for(int i = 1; i <= a; i++){
            answer += i;
        }
        
        System.out.println(answer);
    }
}