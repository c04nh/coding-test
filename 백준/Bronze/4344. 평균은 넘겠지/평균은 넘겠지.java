import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();

        for(int i = 0; i < C; i++){
            int N = scan.nextInt();
            int[] arr = new int[N];
            double total = 0;
            
            for(int j = 0; j < N; j++){
                arr[j] = scan.nextInt();
                total += arr[j];
            }

            double avg = total / N;
            int cnt = 0;
            
            for(int j = 0; j < N; j++){
                if(arr[j] > avg) cnt++;
            }
            
            System.out.println(String.format("%.3f", (double)cnt / (double)N * 100) + "%");
        }
    }
}