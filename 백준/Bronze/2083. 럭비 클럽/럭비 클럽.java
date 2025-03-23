import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String name = scan.next();
            int age = scan.nextInt();
            int weight = scan.nextInt();

            if(name.equals("#") && age == 0 && weight == 0) break;

            System.out.print(name);
            if(age > 17 || weight >= 80){
                System.out.println(" Senior");
            }else System.out.println(" Junior");
        }
    }
}