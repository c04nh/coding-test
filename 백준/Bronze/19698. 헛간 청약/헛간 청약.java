import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int W = scan.nextInt();
        int H = scan.nextInt();
        int L = scan.nextInt();

        int cnt = (W / L) * (H / L);

        if(cnt > N) cnt = N;
        System.out.print(cnt);
    }
}