import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        int n = K / M;
        int m = K % M;

        System.out.print(n + " " + m);
    }
}