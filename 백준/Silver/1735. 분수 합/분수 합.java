import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        long a1 = scan.nextLong();
        long b1 = scan.nextLong();
        long a2 = scan.nextLong();
        long b2 = scan.nextLong();

        long A = a1 * b2 + a2 * b1;
        long B = b1 * b2;

        long max = A;
        long min = B;

        if(A < B){
            max = A;
            min = B;
        }

        long remain;
            
        while(min != 0){
            remain = max % min;
            max = min;
            min = remain;
        }

        System.out.print(A / max + " " + B / max);

        
	}
}