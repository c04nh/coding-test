import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int N = scan.nextInt();
            int sum = 0;

            for(int j = 0; j < N; j++){
                sum += scan.nextInt();
            }

            System.out.println(sum);
        }
    }
}