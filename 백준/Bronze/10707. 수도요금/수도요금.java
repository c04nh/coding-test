import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int P = scan.nextInt();

        int X = A * P;
        int Y = B;

        if(C < P){
            Y += (P - C) * D;
        }

        if(X < Y) System.out.print(X);
        else System.out.print(Y);            
        
    }
}
