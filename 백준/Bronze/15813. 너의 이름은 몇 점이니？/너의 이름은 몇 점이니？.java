import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String name = scan.next();
        int score = 0;

        for(int i = 0; i < N; i++){
            score += name.charAt(i) - 'A' + 1;
        }

        System.out.print(score);
    }
}