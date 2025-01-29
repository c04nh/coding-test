import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] remainder = new int[42];
        Arrays.fill(remainder, 0);
        int[] arr = new int[10];
        int answer = 0;
        
        for(int i = 0; i < 10; i++){
            arr[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            remainder[arr[i] % 42]++;
        }
        
        for(int i = 0; i < 42; i++){
            if(remainder[i] != 0) answer++;
        }
        
        System.out.print(answer);
    }
}