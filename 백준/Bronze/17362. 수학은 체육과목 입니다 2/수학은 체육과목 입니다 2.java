import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if((n-1) % 8 == 0) System.out.print(1);
        else if((n-2) % 8 == 0 || n % 8 == 0) System.out.print(2);
        else if((n-3) % 4 == 0) System.out.print(3);
        else if((n-4) % 8 == 0 || (n+2) % 8 == 0) System.out.print(4);
        else System.out.print(5);
    }
}