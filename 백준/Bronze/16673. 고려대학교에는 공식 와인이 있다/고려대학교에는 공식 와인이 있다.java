import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        int K = scan.nextInt();
        int P = scan.nextInt();
        int total = 0;

        for(int i = 1; i <= C; i++){
            total += K * i + P * i * i;
        }

        System.out.print(total);
    }
}