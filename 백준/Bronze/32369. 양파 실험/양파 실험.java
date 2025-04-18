import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int good = 1;
        int bad = 1;

        for(int i = 0; i < N; i++){
            good += A;
            bad += B;

            if(good < bad){
                int temp = good;
                good = bad;
                bad = temp;
            }else if(good == bad){
                bad -= 1;
            }
        }

        System.out.print(good + " " + bad);
    }
}