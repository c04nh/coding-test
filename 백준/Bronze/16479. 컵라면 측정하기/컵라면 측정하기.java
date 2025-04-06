import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int D1 = scan.nextInt();
        int D2 = scan.nextInt();

        if(D1 == D2) System.out.print(K * K);
        else{
            int a = (D1 - D2) / 2;
            int height2 = (K * K) - (a * a);
        
            System.out.print(height2);
        }

        
    }
}