import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N <= 100000 && N % 2024 == 0) System.out.print("Yes");
        else System.out.print("No");
    }
}