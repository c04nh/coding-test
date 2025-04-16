import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int answer = 0;

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }

        int M = scan.nextInt();

        for(int i = 0; i < M; i++){
            int input = scan.nextInt();
            answer += arr[input-1];
        }

        System.out.print(answer);
    }
}