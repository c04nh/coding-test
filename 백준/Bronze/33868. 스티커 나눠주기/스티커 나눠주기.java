import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int B = scan.nextInt();

        for(int i = 1; i < N; i++){
            int input1 = scan.nextInt();
            int input2 = scan.nextInt();

            if(T < input1) T = input1;
            if(B > input2) B = input2;
        }

        int num = T * B;

        System.out.print(num % 7 + 1);
    }
}