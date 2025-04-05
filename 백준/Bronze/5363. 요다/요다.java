import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.nextLine();

        for(int i = 0; i < N; i++){
            str = scan.nextLine();
            String[] arr = str.split(" ");

            for(int j = 2; j < arr.length; j++){
                System.out.print(arr[j] + " ");
            }

            System.out.print(arr[0] + " " + arr[1] + "\n");
            
        }
    }
}