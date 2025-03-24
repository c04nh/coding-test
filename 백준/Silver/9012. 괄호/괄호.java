import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            String str = scan.next();
            System.out.println(check(str));
        }
    }

    public static String check(String str){
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == '(') stack.push(c);
            else if(stack.isEmpty()) return "NO";
            else stack.pop();
        }

        if(stack.isEmpty()) return "YES";
        else return "NO";
    }
}