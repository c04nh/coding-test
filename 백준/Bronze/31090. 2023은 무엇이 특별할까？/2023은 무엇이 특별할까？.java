import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int N = scan.nextInt();

            if((N + 1) % (N % 100) == 0) System.out.println("Good");
            else System.out.println("Bye");
        }
    }
}