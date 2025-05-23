import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();

        int odd = 0;
        int even = 0;

        for(int i = 0; i < N; i++){
            if((int)str.charAt(i) % 2 == 1) odd++;
            else even++;
        }

        if(odd > even) System.out.print(1);
        else if(odd < even) System.out.print(0);
        else System.out.print(-1);
    }
}