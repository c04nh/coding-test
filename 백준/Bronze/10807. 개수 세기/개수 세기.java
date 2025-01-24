import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        int N = scan.nextInt();
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }
        
        int num = scan.nextInt();
        
        for(int i = 0; i < N; i++){
            if(arr[i] == num){
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}