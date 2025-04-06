import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int N = scan.nextInt();
            int cnt = 0;

            if(N == 0) break;

            for(int i = N; i >= 1; i--){
                cnt += i * i;
            }

            System.out.println(cnt);
        }

    }
}