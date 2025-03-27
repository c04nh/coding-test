import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = (N-i)*2; k >= 1; k--){
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = N-1; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            for(int k = 1; k <= (N-i)*2; k++){
                System.out.print(" ");
            }
            for(int l = i; l >= 1; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}