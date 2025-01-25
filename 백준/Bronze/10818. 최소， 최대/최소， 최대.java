import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }
        
        int max_num = arr[0];
        int min_num = arr[0];
        
        for(int i = 1; i < N; i++){
            if(max_num < arr[i]) max_num = arr[i];
            if(min_num > arr[i]) min_num = arr[i];
        }
        
        System.out.print(min_num + " " + max_num);
    }
}