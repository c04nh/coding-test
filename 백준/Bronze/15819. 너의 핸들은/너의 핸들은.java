import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int I = scan.nextInt();
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = scan.next();
        }

        Arrays.sort(arr);

        System.out.print(arr[I-1]);
    }
}