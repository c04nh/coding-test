import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch[] = new char[str.length()];

        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }

        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            char temp = ch[A];
            ch[A] = ch[B];
            ch[B] = temp;
        }

        for(char c : ch){
            System.out.print(c);
        }
    }
}