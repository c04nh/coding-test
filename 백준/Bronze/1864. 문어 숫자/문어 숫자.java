import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String str = scan.next();
            if(str.equals("#")) break;

            int a = 0;
            int num = 0;

            for(int i = str.length()-1; i >= 0; i--){
                switch(str.charAt(i)){
                    case '-':
                        num += 0 * Math.pow(8, a);
                        break;
                    case '\\':
                        num += 1 * Math.pow(8, a);
                        break;
                    case '(':
                        num += 2 * Math.pow(8, a);
                        break;
                    case '@':
                        num += 3 * Math.pow(8, a);
                        break;
                    case '?':
                        num += 4 * Math.pow(8, a);
                        break;
                    case '>':
                        num += 5 * Math.pow(8, a);
                        break;
                    case '&':
                        num += 6 * Math.pow(8, a);
                        break;
                    case '%':
                        num += 7 * Math.pow(8, a);
                        break;
                    case '/':
                        num += -1 * Math.pow(8, a);
                        break;
                }
                a++;
            }

            System.out.println(num);
        }

        
    }
}