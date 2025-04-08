import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lv = scan.nextInt();
        String str = scan.next();
        
        if(str.equals("miss")) System.out.print(0 * lv);
        else if(str.equals("bad")) System.out.print(200 * lv);
        else if(str.equals("cool")) System.out.print(400 * lv);
        else if(str.equals("great")) System.out.print(600 * lv);
        else if(str.equals("perfect")) System.out.print(1000 * lv);
    }
}