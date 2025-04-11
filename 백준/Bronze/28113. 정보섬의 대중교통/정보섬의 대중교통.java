import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A > B) System.out.print("Subway");
        else if(A < B) System.out.print("Bus");
        else System.out.print("Anything");
    }
}