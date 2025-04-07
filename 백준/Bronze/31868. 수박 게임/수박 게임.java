import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        for(int i = 1; i < N; i++){
            K /= 2;
        }

        System.out.print(K);
    }
}