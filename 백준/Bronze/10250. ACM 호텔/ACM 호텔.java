import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int H = scan.nextInt();
            int W = scan.nextInt();
            int N = scan.nextInt();

            int num1 = N / H;
            int num2 = N % H;

            if(num2 == 0){
                System.out.print(H);
                if(num1 < 10) System.out.print(0);
                System.out.println(num1);
            }else{
                System.out.print(num2);
                if(num1 + 1 < 10) System.out.print(0);
                System.out.println(num1 + 1);
            }
        }
    }
}