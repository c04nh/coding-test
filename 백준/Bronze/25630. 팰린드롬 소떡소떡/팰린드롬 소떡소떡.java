import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        int cnt = 0;

        for(int i = 0; i < N/2; i++){
            if(str.charAt(i) != str.charAt(N-1-i)) cnt++;
        }
        
        System.out.print(cnt);
    }
}