import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int F = scan.nextInt();

        if(S > F) System.out.print("flight");
        else System.out.print("high speed rail");
        
    }
}