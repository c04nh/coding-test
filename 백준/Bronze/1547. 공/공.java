import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[3];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        for(int i = 0; i < N; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            int temp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = temp;
        }

        for(int i = 0; i < 3; i++){
            if(arr[i] == 1) System.out.print(i+1);
        }
    }
}