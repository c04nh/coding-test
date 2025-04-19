import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int s = scan.nextInt();
            int n = scan.nextInt();

            for(int j = 0; j < n; j++){
                int q = scan.nextInt();
                int p = scan.nextInt();
                s += q * p;
            }

            System.out.println(s);
            
        }
    }
}