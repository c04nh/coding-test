import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                System.out.print("G");
            }
            for(int j = 1; j <= 3 * N; j++){
                System.out.print(".");
            }
            System.out.println();
        }
        
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                System.out.print(".");
            }
            for(int j = 1; j <= N; j++){
                System.out.print("I");
            }
            for(int j = 1; j <= N; j++){
                System.out.print(".");
            }
            for(int j = 1; j <= N; j++){
                System.out.print("T");
            }
            System.out.println();
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= 2 * N; j++){
                System.out.print(".");
            }
            for(int j = 1; j <= N; j++){
                System.out.print("S");
            }
            for(int j = 1; j <= N; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}