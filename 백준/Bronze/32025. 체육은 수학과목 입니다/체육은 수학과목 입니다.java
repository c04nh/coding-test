import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt() * 100;
        int h = scan.nextInt() * 100;

        if(w > h) System.out.print(h/2);
        else System.out.print(w/2);
    }
}