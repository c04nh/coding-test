import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int year = 2024;
        int month = 8;

        for(int i = 1; i < N; i++){
            month += 7;
        }

        year += month / 12;
        month %= 12;

        if(month == 0){
            year--;
            month = 12;
        }

        System.out.print(year + " " + month);
    }
}