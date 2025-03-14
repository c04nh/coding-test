import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }

        int gcd = getDivisior(arr[1] - arr[0], arr[2] - arr[1]);
        for(int i = 1; i < N - 1; i++){
            gcd = getDivisior(arr[i+1] - arr[i], gcd);
        }

        for(int i = 0; i < N - 1; i++){
            cnt += (arr[i+1] - arr[i]) / gcd - 1;
        }

        System.out.print(cnt);
        
    }

    public static int getDivisior(int a, int b){
        int max = a;
        int min = b;

        if(a < b){
            max = b;
            min = a;
        }

        while(min != 0){
            int remain = max % min;
            max = min;
            min = remain;
        }

        return max;
    }
}