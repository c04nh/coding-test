import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            String input = scan.next();

            int seq = 1;
            int score = 0;
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j) == 'O'){
                    score += seq;
                    seq++;
                }else seq = 1;
            }

            System.out.println(score);
        }
    }
}