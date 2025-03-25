import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        int a = 0;

        for(int i = 0; i < N; i++){
            int num = scan.nextInt();

            if(num == a + 1) a = num;
            else{
                if(stack.isEmpty()) stack.push(num);
                else if(stack.peek() > num) stack.push(num);
                else{
                    while(true){
                        if(stack.isEmpty()) break;
                        else if(stack.peek() == a + 1){
                            a = stack.peek();
                            stack.pop();
                        }else break;
                    }
                    stack.push(num);
                }
            }

        }

        while(true){
            if(stack.isEmpty()) break;
            else if(stack.peek() == a + 1){
                a = stack.peek();
                stack.pop();
            }else break;
        }

        if(stack.isEmpty()) System.out.println("Nice");
        else System.out.println("Sad");
    }
}