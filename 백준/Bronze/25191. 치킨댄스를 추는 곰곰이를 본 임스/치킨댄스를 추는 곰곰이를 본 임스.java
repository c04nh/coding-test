import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt() / 2;
        int B = scan.nextInt();

        if(A + B > N) System.out.print(N);
        else System.out.print(A+B);
        
        
    }
}