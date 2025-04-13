import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        String answer = "";

        for(int i = 0; i < N; i++){
            if(str.charAt(i) == 'I') answer += "i";
            else answer += "L";
        }

        System.out.print(answer);
    }
}