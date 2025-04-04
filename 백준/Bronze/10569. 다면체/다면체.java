import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int V = scan.nextInt();
            int E = scan.nextInt();
            System.out.println(2 - V + E);
        }
    }
}