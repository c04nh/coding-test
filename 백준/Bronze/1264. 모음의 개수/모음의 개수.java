import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Character> ch = new ArrayList<Character>(Arrays.asList('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));

        while(true){
            String s = scan.nextLine();
            int cnt = 0;
            if(s.equals("#")) break;

            for(int i = 0; i < s.length()-1; i++){
                if(ch.contains(s.charAt(i))) cnt++;
            }

            System.out.println(cnt);            
        }
    }
}