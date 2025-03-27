import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = N-i; k >= 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}