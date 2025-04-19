import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        int ans = 84;
        if(c > 'I') ans += (c - 'I');
        else ans += ('I' - c);

        System.out.print(ans);
    }
}