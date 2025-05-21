import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int case1 = A + D;
        int case2 = B + C;

        if(case1 < case2) System.out.print(case1);
        else System.out.print(case2);
    }
}