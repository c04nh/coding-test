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
        int E = scan.nextInt();
        int F = scan.nextInt();

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        int score1 = A * 13 + B * 7 + C * 5 + D * 3 + E * 3 + F * 2;
        double score2 = a * 13 + b * 7 + c * 5 + d * 3 + e * 3 + f * 2 + 1.5;

        if(score1 > score2) System.out.print("cocjr0208");
        else System.out.print("ekwoo");
    }
}