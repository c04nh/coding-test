import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long X = scan.nextLong();
        long[] arr = new long[N];

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextLong();
        }

        long cost = arr[0] + arr[1];

        for(int i = 1; i < N - 1; i++){
            if(cost > arr[i] + arr[i+1]) cost = arr[i] + arr[i+1];
        }

        System.out.print(cost * X);
    }
}