import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int level = 0;

        while(N >= 10){
            String str = Integer.toString(N);
            int num = 1;

            for(int i = 0; i < str.length(); i++){
                num *= str.charAt(i) - '0';
            }

            N = num;
            level++;            
        }

        System.out.print(level);
    }
}