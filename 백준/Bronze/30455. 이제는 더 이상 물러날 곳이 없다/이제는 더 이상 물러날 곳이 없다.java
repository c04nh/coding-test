import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N % 2 == 1) System.out.print("Goose");
        else System.out.print("Duck");
    }
}