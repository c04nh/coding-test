import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();

        for(int i = 0; i < 9; i++){
            int n = scan.nextInt();
            price -= n;
        }

        System.out.print(price);
    }
}