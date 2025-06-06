import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double N = scan.nextDouble();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= Math.ceil(N/2); j++){
                System.out.print("* ");
            }
            System.out.println();
            for(int j = 1; j <= N/2; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}