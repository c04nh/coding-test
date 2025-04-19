import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long emotion = 0;
        long total = 0;

        for(int i = 0; i < N; i++){
            long a = scan.nextLong();
            if(a == 1) emotion++;
            else emotion--;

            total += emotion;
        }

        System.out.print(total);
    }
}