import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int case1 = A + B - C;
        String str = Integer.toString(A) + Integer.toString(B);
        int case2 = Integer.parseInt(str) - C;

        System.out.println(case1);
        System.out.println(case2);
    }
}