import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            String str = scan.next();
            str = str.substring(2);

            if(Integer.parseInt(str) <= 90) cnt++;
        }

        System.out.print(cnt);
    }
}