import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        char[] arr = str.toCharArray();

        for(int i = 1; i < N; i++){
            String input = scan.next();

            for(int j = 0; j < input.length(); j++){
                if(str.charAt(j) != input.charAt(j)){
                    arr[j] = '?';
                }
            }
        }

        for(char c : arr){
            System.out.print(c);
        }
    }
}