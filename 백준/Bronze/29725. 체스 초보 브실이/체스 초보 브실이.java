import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int white = 0;
        int black = 0;

        for(int i = 0; i < 8; i++){
            String str = scan.next();
            for(int j = 0; j < 8; j++){
                char ch = str.charAt(j);

                if(ch == 'P') white += 1;
                else if(ch == 'p') black += 1;
                else if(ch == 'N') white += 3;
                else if(ch == 'n') black += 3;
                else if(ch == 'B') white += 3;
                else if(ch == 'b') black += 3;
                else if(ch == 'R') white += 5;
                else if(ch == 'r') black += 5;
                else if(ch == 'Q') white += 9;
                else if(ch == 'q') black += 9;
            }
        }

        System.out.print(white - black);
    }
}