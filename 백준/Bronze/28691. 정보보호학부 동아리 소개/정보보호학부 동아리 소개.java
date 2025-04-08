import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if(str.charAt(0) == 'M') System.out.print("MatKor");
        else if(str.charAt(0) == 'W') System.out.print("WiCys");
        else if(str.charAt(0) == 'C') System.out.print("CyKor");
        else if(str.charAt(0) == 'A') System.out.print("AlKor");
        else if(str.charAt(0) == '$') System.out.print("$clear");
    }
}