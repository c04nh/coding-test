import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            String str = scan.next();

            if(str.length() >= 6 && str.length() <= 9) System.out.println("yes");
            else System.out.println("no");
        }
        
    }
}