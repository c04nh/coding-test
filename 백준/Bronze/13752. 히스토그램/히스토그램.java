import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            int num = scan.nextInt();

            for(int j = 0; j < num; j++){
                System.out.print("=");
            }

            System.out.println();
        }
    }
}