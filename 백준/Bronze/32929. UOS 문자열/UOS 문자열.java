import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();

        if(x % 3 == 0){
            System.out.print("S");
        }else if(x % 3 == 1){
            System.out.print("U");
        }else{
            System.out.print("O");
        }
    }
}