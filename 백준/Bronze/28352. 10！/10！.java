import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        long fac = 1;

        for(long i = 2; i <= input; i++){
            fac *= i;
        }

        fac /= (7 * 24 * 60 * 60);

        System.out.print(fac);
    }
}