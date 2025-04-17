import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num = scan.nextInt();

        for(int i = 1; i < 7; i++){
            String input = scan.next();
            int n = scan.nextInt();

            if(num < n){
                str = input;
                num = n;
            }
        }

        System.out.print(str);
    }
}