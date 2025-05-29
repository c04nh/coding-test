import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int mul = num1 * num2;

        while(num2 > 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println(num1);
        System.out.println(mul / num1);
    }
}