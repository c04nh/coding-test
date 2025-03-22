import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            int x = scan.nextInt();
            if(x == 0) stack.pop();
            else stack.push(x);
        }

        int sum = stack.stream().mapToInt(Integer::intValue).sum();
        if(stack.isEmpty()) sum = 0;
        
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}