import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int N = scan.nextInt();

            if(N == 0) break;

            System.out.print(N + " ");

            while(N >= 10){
                int num = N;
                int mul = 1;
                while(num > 0){
                    mul *= num % 10;
                    num /= 10;
                }
    
                N = mul;
                
                System.out.print(N + " ");
            }
            System.out.println();
        }
        
    }
}
