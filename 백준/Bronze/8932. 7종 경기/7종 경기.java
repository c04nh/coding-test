import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int e = scan.nextInt();
            int f = scan.nextInt();
            int g = scan.nextInt();

            int score = 0;

            score += 9.23076 * Math.pow(26.7 - a, 1.835);
            score += 1.84523 * Math.pow(b - 75, 1.348);
            score += 56.0211 * Math.pow(c - 1.5, 1.05);
            score += 4.99087 * Math.pow(42.5 - d, 1.81);
            score += 0.188807 * Math.pow(e - 210, 1.41);
            score += 15.9803 * Math.pow (f - 3.8, 1.04);
            score += 0.11193 * Math.pow(254 - g, 1.88);

            System.out.println(score);
        }

    }
}