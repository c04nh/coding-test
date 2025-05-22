import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int angle = 0;
        
        for(int i = 0; i < 10; i++){
            int n = scan.nextInt(); 

            switch(n){
                case 1:
                    angle += 90;
                    break;
                case 2:
                    angle += 180;
                    break;
                case 3:
                    angle -= 90;
                    break;
            }
        }

        if(angle > 0){
            switch(angle % 360){
                case 0 :
                    System.out.print("N");
                    break;
                case 90 :
                    System.out.print("E");
                    break;
                case 180 :
                    System.out.print("S");
                    break;
                case 270 :
                    System.out.print("W");
                    break;
            }
        }else{
            switch(angle * (-1) % 360){
                case 0 :
                    System.out.print("N");
                    break;
                case 90 :
                    System.out.print("W");
                    break;
                case 180 :
                    System.out.print("S");
                    break;
                case 270 :
                    System.out.print("E");
                    break;
            }
        }
    }
}