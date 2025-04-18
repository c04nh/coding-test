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
        int E = scan.nextInt();
        int time = 0;

        if(A < 0){
            time += (-1 * A) * C; 
            A = 0;
        }

        if(A == 0){
            time += D;
        }

        time += (B - A) * E;
        
        System.out.print(time);
    }
}