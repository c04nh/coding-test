import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String str = scan.nextLine();
            if(str.equals(".")) break;
            System.out.println(check(str));
        }
    }

    public static String check(String str){
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == '(' || c == '[') stack.push(c);
            else if(c == ')'){
                if(stack.isEmpty()) return "no";
                else if(stack.peek() == '(') stack.pop();
                else return "no";
            }else if(c == ']'){
                if(stack.isEmpty()) return "no";
                else if(stack.peek() == '[') stack.pop();
                else return "no";
            }
        }


        if(stack.isEmpty()) return "yes";
        else return "no";
    }
}