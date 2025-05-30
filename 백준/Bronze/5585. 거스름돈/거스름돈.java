import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        int change = 1000 - price;
        int cnt = 0;

        cnt += (change / 500);
        change %= 500;
        cnt += (change / 100);
        change %= 100;
        cnt += (change / 50);
        change %= 50;
        cnt += (change / 10);
        change %= 10;
        cnt += (change / 500);
        change %= 500;
        cnt += (change / 100);
        change %= 100;
        cnt += (change / 5);
        change %= 5;
        cnt += change;

        System.out.print(cnt);
    }
}