import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                for(int j = 0; j < N; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j = 0; j < N; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}