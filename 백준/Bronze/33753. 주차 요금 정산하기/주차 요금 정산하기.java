import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int T = scan.nextInt();

        int cost = A;

        if(T > 30){
            cost += ((T - 30) / B) * C;

            if((T - 30) % B != 0) cost += C;
        }

        System.out.print(cost);
    }
}