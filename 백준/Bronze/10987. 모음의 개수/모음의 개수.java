import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case 'a':
                    cnt++;
                    break;
                case 'e':
                    cnt++;
                    break;
                case 'i':
                    cnt++;
                    break;
                case 'o':
                    cnt++;
                    break;
                case 'u':
                    cnt++;
                    break;
            }
        }

        System.out.print(cnt);
    }
}