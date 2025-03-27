import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = N; i >= 1; i--){
            for(int j = i; j > 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k < (N-i+1)*2; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}