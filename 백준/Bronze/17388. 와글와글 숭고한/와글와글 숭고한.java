import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int K = scan.nextInt();
        int H = scan.nextInt();

        if(S + K + H >= 100) System.out.println("OK");
        else{
            if(S < K && S < H){
                System.out.print("Soongsil");
            }else if(S > K && H > K){
                System.out.print("Korea");
            }else{
                System.out.print("Hanyang");
            }
        }
    }
}
