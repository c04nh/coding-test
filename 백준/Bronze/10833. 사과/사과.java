import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            int student = scan.nextInt();
            int apple = scan.nextInt();

            cnt += apple % student;
            
        }
        System.out.println(cnt);
    }
}