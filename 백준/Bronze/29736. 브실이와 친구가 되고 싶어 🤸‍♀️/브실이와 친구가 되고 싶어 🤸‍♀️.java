import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int K = scan.nextInt();
        int X = scan.nextInt();

        int count = 0;

        for(int i = A; i <= B; i++){
            if(i >= K - X && i <= K + X) count++;
        }

        if(count > 0) System.out.print(count);
        else System.out.print("IMPOSSIBLE");

        
    }
}