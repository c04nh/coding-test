import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int U = scan.nextInt();
        int L = scan.nextInt();

        if(N >= 1000){
            if(U >= 8000 || L >= 260) System.out.print("Very Good");
            else System.out.print("Good");
        }else System.out.print("Bad");
    }
}