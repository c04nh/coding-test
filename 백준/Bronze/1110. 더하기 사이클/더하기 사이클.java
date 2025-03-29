import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = N / 10;
        int b = N % 10;
        int cnt = 0;

        int num = N;
        while(true){
            int temp = a;
            a = num % 10;
            b = (a + temp) % 10;
            num = a * 10 + b;
            cnt++;
            
            if(num == N) break;
        }

        System.out.print(cnt);
    }
}