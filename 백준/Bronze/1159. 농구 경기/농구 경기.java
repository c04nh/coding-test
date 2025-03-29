import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] arr = new int[26];
        Arrays.fill(arr, 0);

        for(int i = 0; i < N; i++){
            String input = scan.next();
            arr[input.charAt(0)-'a']++;
        }

        String str = "";

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 5){
                str += (char)(i + 'a');
            }
        }

        if(str.length() == 0) str = "PREDAJA";
        System.out.println(str);
    }
}