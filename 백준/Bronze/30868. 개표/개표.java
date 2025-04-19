import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            int n = scan.nextInt();
            String str = "";

            for(int j = 1; j <= n; j++){
                if(j % 5 == 0){
                    str = str.substring(0, str.length()-4) + "++++ ";
                }else str += "|";
            }

            System.out.println(str);
        }
    }
}