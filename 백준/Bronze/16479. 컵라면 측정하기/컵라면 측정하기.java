import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double K = scan.nextDouble();
        double D1 = scan.nextDouble();
        double D2 = scan.nextDouble();

        if(D1 == D2){
            if((K * K) % 1 == 0){
                System.out.print((int)(K * K));
            }else System.out.print(K * K);
        }
        else{
            double a = (D1 - D2) / 2;
            double height2 = (K * K) - (a * a);

            if(height2 % 1 == 0){
                System.out.print((int)height2);
            }else System.out.print(height2);
                
        }

        
    }
}