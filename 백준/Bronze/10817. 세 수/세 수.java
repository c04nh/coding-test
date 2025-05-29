import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < 2; i++){
            for(int j = 1; j < 3; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print(arr[1]);
    }
}