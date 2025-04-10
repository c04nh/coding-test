import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int S = scan.nextInt();

        int rice = 0;

        if((T >= 12 && T <= 16) && S == 0) rice = 320;
        else rice = 280;

        System.out.print(rice);
        
    }
}