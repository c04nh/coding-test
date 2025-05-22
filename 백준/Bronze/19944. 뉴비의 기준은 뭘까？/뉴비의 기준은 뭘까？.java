import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        if(M <= 2) System.out.print("NEWBIE!");
        else if(M <= N) System.out.print("OLDBIE!");
        else System.out.print("TLE!");
    }
}