import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int I = scan.nextInt();

        System.out.print(A * (I-1) + 1);
    }
}