import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int P = scan.nextInt();

        for(int i = 0; i < P; i++){
            int N = scan.nextInt();
            double D = scan.nextDouble();
            double A = scan.nextDouble();
            double B = scan.nextDouble();
            double F = scan.nextDouble();

            double ans = D / (A + B) * F;

            System.out.println(N + " " + String.format("%.6f", ans));
        }
    }
}