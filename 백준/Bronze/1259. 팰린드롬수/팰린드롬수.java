import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String input = scan.next();
            boolean chk = true;

            if(input.equals("0")) break;

            
            for(int i = 0; i < input.length()/2; i++){
                if(input.charAt(i) != input.charAt(input.length()-i-1)) chk = false;
            }

            if(chk) System.out.println("yes");
            else System.out.println("no");
        }
    }
}