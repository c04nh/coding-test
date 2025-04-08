import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 97) System.out.print((char)(str.charAt(i)-32));
            else System.out.print((char)(str.charAt(i)+32));
        }
    }
}