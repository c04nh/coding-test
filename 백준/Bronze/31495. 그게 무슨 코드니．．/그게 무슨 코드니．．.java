import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if(str.length() > 2){
            if(str.charAt(0) == '\"' && str.charAt(str.length()-1) == '\"') System.out.print(str.substring(1, str.length()-1));
            else System.out.print("CE");
        }
        else System.out.print("CE");
        
    }
}