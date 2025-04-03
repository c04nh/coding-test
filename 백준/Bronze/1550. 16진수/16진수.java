import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int a = 0;
        int num = 0;

        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) >= 65){
                num += (str.charAt(i) - 55) * Math.pow(16, a);
            }else{
                num += (str.charAt(i) - '0') * Math.pow(16, a);
            }
            a++;
        }

        System.out.print(num);
    }
}