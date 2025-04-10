import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        if(str1.length() >= str2.length()) System.out.print("go");
        else System.out.print("no");
    }
}