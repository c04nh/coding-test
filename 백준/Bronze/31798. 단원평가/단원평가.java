import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a == 0){
            System.out.print(c * c - b);
        }else if(b == 0){
            System.out.print(c * c - a);
        }else{
            System.out.print((int)Math.sqrt(a + b));
        }
        
    }
}
