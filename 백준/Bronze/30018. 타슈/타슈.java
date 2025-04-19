import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < N; i++){
            b[i] = scan.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(a[i] > b[i]) cnt += (a[i] - b[i]);
        }

        System.out.print(cnt);
    }
}