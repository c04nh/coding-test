import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        System.out.print("<");
        while(queue.size() > 1){
            cnt++;
            if(cnt == K){
                System.out.print(queue.peek() + ", ");
                queue.remove();
                cnt = 0;
            }else{
                queue.add(queue.peek());
                queue.remove();
            }
        }

        System.out.print(queue.poll() + ">");
    }
}