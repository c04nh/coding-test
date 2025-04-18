import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double num1 = a * b / c;
        double num2 = a / b * c;

        if(num1 > num2) System.out.print((int)num1);
        else System.out.print((int)num2);
    }
}