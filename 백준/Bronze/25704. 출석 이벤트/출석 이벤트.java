import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();

        if(N >= 20){
            int[] arr = {P - 500, P / 100 * 90, P - 2000, P / 100 * 75};
            Arrays.sort(arr);
            if(arr[0] < 0) System.out.print(0);
            else System.out.print(arr[0]);
        }else if(N >= 15){
            int[] arr = {P - 500, P / 100 * 90, P - 2000};
            Arrays.sort(arr);
            if(arr[0] < 0) System.out.print(0);
            else System.out.print(arr[0]);
        }else if(N >= 10){
            int[] arr = {P - 500, P / 100 * 90};
            Arrays.sort(arr);
            if(arr[0] < 0) System.out.print(0);
            else System.out.print(arr[0]);
        }else if(N >= 5){
            if(P - 500 < 0) System.out.print(0);
            else System.out.print(P - 500);
        }else{
            System.out.print(P);
        }
    }
}