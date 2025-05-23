import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = 0;
        int b = 0;
        int g = 0;

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                String str = scan.next();
                if(str.equals("w")) w++;
                else if(str.equals("b")) b++;
                else if(str.equals("g")) g++;
            }
        }

        if(w > 0) System.out.print("chunbae");
        else if(b > 0) System.out.print("nabi");
        else if(g > 0) System.out.print("yeongcheol");
    }
}