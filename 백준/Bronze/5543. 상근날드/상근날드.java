import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int burger1 = scan.nextInt();
        int burger2 = scan.nextInt();
        int burger3 = scan.nextInt();
        int coke = scan.nextInt();
        int soda = scan.nextInt();

        int price = 0;

        if(burger1 < burger2){
            if(burger1 < burger3) price += burger1;
            else price += burger3;
        }else{
            if(burger2 < burger3) price += burger2;
            else price += burger3;
        }

        if(coke < soda) price += coke;
        else price += soda;

        price -= 50;

        System.out.print(price);
    }
}