import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int P = scan.nextInt();

        for(int i = 0; i < 5; i++){
            int a = scan.nextInt() - (L * P);
            System.out.print(a + " ");
        }
    }
}