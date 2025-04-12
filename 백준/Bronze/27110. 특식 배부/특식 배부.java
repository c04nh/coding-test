import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int answer = 0;

        if(A > N) answer += N;
        else answer += A;

        if(B > N) answer += N;
        else answer += B;

        if(C > N) answer += N;
        else answer += C;

        System.out.print(answer);
    }
}