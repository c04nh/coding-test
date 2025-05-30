import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R1 = scan.nextInt();
        int S = scan.nextInt();

        int R2 = S * 2 - R1;

        System.out.print(R2);
    }
}