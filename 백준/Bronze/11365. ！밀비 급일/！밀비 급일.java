import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        while(!str.equals("END")){
            for(int i = str.length() - 1; i >= 0; i--){
                System.out.print(str.charAt(i));
            }
            System.out.println();

            str = scan.nextLine();
        }
    }
}