import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int num1 = N / 100 * 78;
        int num2 = N - (N / 100 * 20) / 100 * 22;

        System.out.print(num1 + " " + num2);
    }
}