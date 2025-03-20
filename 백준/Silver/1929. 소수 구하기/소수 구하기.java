import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();

        boolean isPrime = true; 

        for(int i = M; i <= N; i++) {
            if(i == 1) continue;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0 ) {
					isPrime = false;
					break;
				}
			}
            
			if(isPrime) System.out.println(i);
			isPrime = true;
		}
    }
}