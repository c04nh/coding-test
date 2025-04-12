import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();

        double M = (B - A) / 400;
        double answer = 1 / (1 + Math.pow(10, M));

        System.out.print(answer);
    }
}