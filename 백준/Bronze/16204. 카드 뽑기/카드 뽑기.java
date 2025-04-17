import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        int sum = 0;

        if(M > K){
            sum += K;
            sum += (N - M);
        }
        else{
            sum += M;
            sum += (N - K);
        }

        System.out.print(sum);
    }
}