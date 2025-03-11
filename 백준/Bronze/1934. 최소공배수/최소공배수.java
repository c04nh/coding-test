import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            int max = a;
            int min = b;

            if(a < b){
                max = b;
                min = a;
            }

            int remain;
            
            while(min != 0){
                remain = max % min;
                max = min;
                min = remain;
            }

            arr[i] = a * b / max;

        }

        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }
	}
}
