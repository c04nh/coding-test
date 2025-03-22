import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            int order = scan.nextInt();

            switch(order){
                case 1:
                    int x = scan.nextInt();
                    stack.push(x);
                    break;
                case 2 :
                    if(stack.isEmpty()){
                        bw.write(-1 + "\n");
                    }else{
                        bw.write(stack.peek() + "\n");
                        stack.pop();   
                    }
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4 :
                    if(stack.isEmpty()){
                        bw.write(1 + "\n");
                    }else{
                        bw.write(0 + "\n");
                    }
                    break;
                case 5:
                    if(stack.isEmpty()){
                        bw.write(-1 + "\n");
                    }else{
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}