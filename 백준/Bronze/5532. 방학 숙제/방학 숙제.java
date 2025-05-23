import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int math = A / C;
        int kor = B / D;

        if(A % C != 0) math++;
        if(B % D != 0) kor++;

        if(math > kor) System.out.print(L - math);
        else System.out.print(L - kor);
    }
}