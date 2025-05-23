import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int D = scan.nextInt();

        if(M < 2) System.out.print("Before");
        else if(M > 2) System.out.print("After");
        else{
            if(D < 18) System.out.print("Before");
            else if(D > 18) System.out.print("After");
            else System.out.print("Special");
        }
    }
}