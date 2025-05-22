import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int size = 0;

        if(B >= A-1) size = A * 2 - 1;
        else size = B * 2 + 1;

        System.out.print(size);
    }
}