import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            int h1 = scan.nextInt();
            int m1 = scan.nextInt();
            int s1 = scan.nextInt();
            int h2 = scan.nextInt();
            int m2 = scan.nextInt();
            int s2 = scan.nextInt();

            int ah = h2 - h1;
            int am = m2 - m1;
            int as = s2 - s1;

            if(as < 0){
                as += 60;
                am--;
            }

            if(am < 0){
                am += 60;
                ah--;
            }

            System.out.println(ah + " " + am + " " + as);
        }
    }
}