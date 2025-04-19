import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int total = 0;

        for(int i = 0; i < N; i++){
            String str = scan.next();
            int cnt = 0;

            for(int j = 0; j < M; j++){
                if(str.charAt(j) == 'O') cnt++;
            }

            if(cnt > M/2) total++;
        }

        System.out.print(total);
    }
}