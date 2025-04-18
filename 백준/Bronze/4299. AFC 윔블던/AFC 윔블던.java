import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int sub = scan.nextInt();

        double a = (double)(sum + sub) / 2;
        double b = (double)sum - a;

        if(a < 0 || b < 0 || a % 1 != 0) System.out.print(-1);
        else{
            if(a > b) System.out.print((int)a + " " + (int)b);
            else System.out.print((int)b + " " + (int)a);
        }
    }
}