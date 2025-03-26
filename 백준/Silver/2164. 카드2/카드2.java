import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        while(queue.size() > 1){
            queue.remove();
            queue.add(queue.peek());
            queue.remove();
        }

        System.out.println(queue.peek());
    }
}