import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int I = scan.nextInt();
        int A = scan.nextInt();
        int R = scan.nextInt();
        int C = scan.nextInt();

        System.out.print((H*I) - (A*R*C));
    }
}