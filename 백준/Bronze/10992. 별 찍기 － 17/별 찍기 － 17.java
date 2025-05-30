import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N-i; j++) System.out.print(" ");
            if(i == 1 || i == N){
                for(int j = 1; j <= i * 2 - 1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j = 1; j <= i * 2 - 1; j++){
                    if(j == 1 || j == i * 2 - 1) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
        
    }
}