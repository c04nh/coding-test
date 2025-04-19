import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        for(int i = 0; i < K; i++){
            int G = scan.nextInt();
            int P = G * 100 / N;

            if(P > 96) System.out.print("9 ");
            else if(P > 89) System.out.print("8 ");
            else if(P > 77) System.out.print("7 ");
            else if(P > 60) System.out.print("6 ");
            else if(P > 40) System.out.print("5 ");
            else if(P > 23) System.out.print("4 ");
            else if(P > 11) System.out.print("3 ");
            else if(P > 4) System.out.print("2 ");
            else System.out.print("1 ");
            
        }
    }
}