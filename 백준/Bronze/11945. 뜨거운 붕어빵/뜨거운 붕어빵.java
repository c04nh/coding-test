import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        if(N > 0 && M > 0){
            String[] arr = new String[N];

            for(int i = 0; i < N; i++){
                arr[i] = scan.next();
            }
    
            for(int i = 0; i < N; i++){
                for(int j = M - 1; j >= 0; j--){
                    System.out.print(arr[i].charAt(j));
                }
                System.out.println();
            }
        }
        
    }
}