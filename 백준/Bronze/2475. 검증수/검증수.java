import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        long sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += Math.pow(Integer.parseInt(arr[i]), 2);
        }

        System.out.print(sum % 10);
    }
}