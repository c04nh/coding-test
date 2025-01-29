import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }
        
        for(int i = 0; i < M; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr = reverse(arr, a, b);
        }
        
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int[] reverse(int[] arr, int a, int b){
        int[] reverseArr = new int[b - a + 1];
        
        for(int i = b - 1, j = 0; i >= a - 1; i--, j++) { 
            reverseArr[j] = arr[i];
        }
        
        for(int i = a - 1, j = 0; i < b; i++, j++){
            arr[i] = reverseArr[j];
        }
        
        return arr;
    }
}

