import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;

        for(int i = 0; i < 8; i++){
            String str = scan.next();

            if(i % 2 == 0){
                for(int j = 0; j <= 6; j += 2){
                    if(str.charAt(j) == 'F') cnt++;
                }
            }else{
                for(int j = 1; j <= 7; j += 2){
                    if(str.charAt(j) == 'F') cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}