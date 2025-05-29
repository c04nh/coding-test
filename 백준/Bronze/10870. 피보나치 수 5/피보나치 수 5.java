import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int num1 = 0;
        int num2 = 1;

        for(int i = 1; i < n; i++){
            int temp = num2;
            num2 = pibonacci(num1, num2);
            num1 = temp;
        }

        if(n > 0) System.out.print(num2);
        else System.out.print(num1);
    }

    public static int pibonacci(int num1, int num2){
        int num3 = num1 + num2;
        return num3;
    }
}