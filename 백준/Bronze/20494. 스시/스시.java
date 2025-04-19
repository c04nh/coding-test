import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList arrList = new ArrayList<>();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            String str = scan.next();
            
            cnt += str.length();
        }

        System.out.print(cnt);
    }
}