import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        N /= 2;
        M /= 2;

        if(N > M) System.out.print(M);
        else System.out.print(N);
    }
}