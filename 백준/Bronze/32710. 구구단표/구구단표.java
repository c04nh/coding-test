import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int chk = 0;

        if(N < 10) chk = 1;
        else{
            if(N % 2 == 0 & N < 20) chk = 1;
            else if(N % 3 == 0 & N < 30) chk = 1;
            else if(N % 4 == 0 & N < 40) chk = 1;
            else if(N % 5 == 0 & N < 50) chk = 1;
            else if(N % 6 == 0 & N < 60) chk = 1;
            else if(N % 7 == 0 & N < 70) chk = 1;
            else if(N % 8 == 0 & N < 80) chk = 1;
            else if(N % 9 == 0 & N < 90) chk = 1;
        }

        System.out.print(chk);
    }
}