import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5; i++){
            int input = scan.nextInt();

            if(input < 40) input = 40;
            sum += input;
        }

        System.out.print(sum/5);
        
    }
}