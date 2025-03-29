import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String str = scan.next();
            if(str.equals("0")) break;
            int area = str.length() + 1;

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1') area += 2;
                else if(str.charAt(i) == '0') area += 4;
                else area += 3;
            }

            System.out.println(area);
        }
    }
}