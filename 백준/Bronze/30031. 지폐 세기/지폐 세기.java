import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int total = 0;

        for(int i = 0; i < N; i++){
            int width = scan.nextInt();
            int height = scan.nextInt();

            switch(width){
                case 136:
                    total += 1000;
                    break;
                case 142:
                    total += 5000;
                    break;
                case 148:
                    total += 10000;
                    break;
                case 154:
                    total += 50000;
                    break;
            }
        }

        System.out.print(total);
    }
}