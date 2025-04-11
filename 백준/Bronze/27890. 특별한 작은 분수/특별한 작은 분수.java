import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int N = scan.nextInt();

        for(int i = 1; i <= N; i++){
            if(x % 2 == 0){
                x = (x / 2) ^ 6;
            }else{
                x = (2 * x) ^ 6;
            }
        }

        System.out.print(x);
    }
}