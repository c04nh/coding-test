import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] arr = new long[N];
        long[] answer = new long[N];

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextLong();
            boolean chk = checkPrime(arr[i]);
            if(chk) answer[i] = arr[i];
            long index = arr[i] + 1;
            while(!chk){
                chk = checkPrime(index);
                if(chk) answer[i] = index;
                index++;
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(answer[i]);
        }
        
    }

    public static boolean checkPrime(long a){
        if(a == 0) return false;
        else if(a == 1) return false;
        else if(a == 2) return true;
        else{
            for(int i = 2; i <= (long)Math.sqrt(a); i++){
                if(a % i == 0) return false;
            }
        }

        return true;
    }
}