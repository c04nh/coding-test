import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int N = scan.nextInt();
            int K = scan.nextInt();
            int cnt = 0;

            for(int j = 0; j < N; j++){
                cnt += scan.nextInt() / K;
            }

            System.out.println(cnt);
        }
    }
}