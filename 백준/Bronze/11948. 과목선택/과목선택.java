import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sci = new int[4];
        int[] geo = new int[2];
        
        for(int i = 0; i < 4; i++){
            sci[i] = scan.nextInt();
        }

        for(int i = 0; i < 2; i++){
            geo[i] = scan.nextInt();
        }

        Arrays.sort(sci);
        Arrays.sort(geo);

        System.out.print(sci[1] + sci[2] + sci[3] + geo[1]);
    }
}