import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = N-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = N-i; j >= 1; j--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}