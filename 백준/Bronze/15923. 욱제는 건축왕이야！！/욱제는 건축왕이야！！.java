import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][2];
        int len = 0;

        for(int i = 0; i < N; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        for(int i = 1; i < N; i++){
            if((arr[i][0] - arr[i-1][0]) + (arr[i][1] - arr[i-1][1]) > 0){
                len += (arr[i][0] - arr[i-1][0]) + (arr[i][1] - arr[i-1][1]);
            }else{
                len += -1 * ((arr[i][0] - arr[i-1][0]) + (arr[i][1] - arr[i-1][1]));
            }
        }

        if((arr[N-1][0] - arr[0][0]) + (arr[N-1][1] - arr[0][1]) > 0){
            len += (arr[N-1][0] - arr[0][0]) + (arr[N-1][1] - arr[0][1]);
        }else{
            len += -1 * ((arr[N-1][0] - arr[0][0]) + (arr[N-1][1] - arr[0][1]));
        }
        
        
        System.out.print(len);
    }
}