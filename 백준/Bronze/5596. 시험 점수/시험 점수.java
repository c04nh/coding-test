import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inf1 = scan.nextInt();
        int math1 = scan.nextInt();
        int sci1 = scan.nextInt();
        int eng1 = scan.nextInt();
        int inf2 = scan.nextInt();
        int math2 = scan.nextInt();
        int sci2 = scan.nextInt();
        int eng2 = scan.nextInt();

        int S = inf1 + math1 + sci1 + eng1;
        int N = inf2 + math2 + sci2 + eng2;

        if(S > N) System.out.print(S);
        else System.out.print(N);
    }
}