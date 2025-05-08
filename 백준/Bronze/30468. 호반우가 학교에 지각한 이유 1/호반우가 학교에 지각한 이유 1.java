import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int STR = scan.nextInt();
        int DEX = scan.nextInt();
        int INT = scan.nextInt();
        int LUK = scan.nextInt();
        int N = scan.nextInt();
        
        int sum = STR + DEX + INT + LUK;
        int cnt = 0;

        while(sum / 4 < N){
            cnt++;
            sum++;
        }

        System.out.print(cnt);
    }
}