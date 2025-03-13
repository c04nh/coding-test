import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();

        long max = A;
        long min = B;

        if(A < B){
            max = B;
            min = A;
        }

        long remain;

        while(min != 0){
            remain = max % min;
            max = min;
            min = remain;
        }

        long answer = A * B / max;

        System.out.print(answer);
	}
}