import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int X = scan.nextInt();
        int N = scan.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            int K = scan.nextInt();
            for(int j = 0; j < K; j++){
                int A = scan.nextInt();

                if(A == X) cnt++;
            }
        }

        if(N == cnt) System.out.print("YES");
        else System.out.print("NO");
    }
}