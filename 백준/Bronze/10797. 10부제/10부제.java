import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int date = scan.nextInt() % 10;
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            int num = scan.nextInt() % 10;

            if(date == num) cnt++;
        }

        System.out.print(cnt);
    }
}