import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        boolean[] prime = chkPrime();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }

        for(int i : arr){
            int cnt = 0;

            for(int j = 2; j <= i; j++) {
                if(prime[j] && prime[i-j] && j <= i-j) cnt++;
    		}

            System.out.println(cnt);
        } 
    }

    public static boolean[] chkPrime(){
        boolean[] prime = new boolean[1000001];

        prime[0] = false;
        prime[1] = false;

        for(int i = 2; i < 1000001; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            prime[i] = isPrime;
    		isPrime = true;
        }

        return prime;
    }
}