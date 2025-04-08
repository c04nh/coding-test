import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();

        if(N > 2147483647 || N < -2147483648) System.out.print("long long");
        else if(N > 32767 || N < -32768) System.out.print("int");
        else System.out.print("short");
    }
}