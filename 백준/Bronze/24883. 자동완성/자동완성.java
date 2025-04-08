import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if(str.charAt(0) == 'N' || str.charAt(0) == 'n') System.out.print("Naver D2");
        else System.out.print("Naver Whale");
    }
}