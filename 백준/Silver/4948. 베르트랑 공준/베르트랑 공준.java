import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();

        while(true){
            int N = scan.nextInt();
            if(N == 0) break;
            arrList.add(N);
        }

        for(int i : arrList){
            boolean isPrime = true;
            int cnt = 0;

            for(int j = i+1; j <= i*2; j++) {
                if(j == 1) continue;
    			for(int k = 2; k <= Math.sqrt(j); k++) {
    				if(j % k == 0 ) {
    					isPrime = false;
    					break;
    				}
    			}
            
    			if(isPrime) cnt++;
    			isPrime = true;
    		}
            System.out.println(cnt);
        } 
    }
}