import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int F = scan.nextInt();

        N = N - (N%100);

        for(int i = 0; i < 100; i++){
            if((N + i) % F == 0){
                System.out.println(String.format("%02d", i));
                break;
            }
        }
    }
}