import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int N = scan.nextInt();
        int M = scan.nextInt();

        if(K * N - M > 0) System.out.print(K * N - M);
        else System.out.print(0);
    }
}