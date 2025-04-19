import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 100;
        int b = 100;
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            if(num1 > num2) b -= num1;
            else if(num1 < num2) a -= num2;
        }

        System.out.println(a);
        System.out.println(b);
    }
}