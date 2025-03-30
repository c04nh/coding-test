import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        long answer = 0;

        for(int i = 0; i < A.length(); i++){
            for(int j = 0; j < B.length(); j++){
                answer += (long)(A.charAt(i)-'0') * (long)(B.charAt(j)-'0');
            }
        }

        System.out.print(answer);
    }
}