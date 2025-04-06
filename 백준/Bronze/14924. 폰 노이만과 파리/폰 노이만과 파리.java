import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int T = scan.nextInt();
        int D = scan.nextInt();

        System.out.print(D / (S * 2) * T);
    }
}