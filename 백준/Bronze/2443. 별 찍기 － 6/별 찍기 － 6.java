import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = N; i >= 1; i--){
            for(int k = 0; k <(N-i); k++){
                System.out.print(" ");
            }
            for(int j = i*2-1; j >= 1; j--){
                System.out.print("*");
            }            
            System.out.println();
        }
    }
}