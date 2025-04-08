import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if(str.equals("SONGDO")) System.out.print("HIGHSCHOOL");
        else if(str.equals("CODE")) System.out.print("MASTER");
        else if(str.equals("2023")) System.out.print("0611");
        else if(str.equals("ALGORITHM")) System.out.print("CONTEST");
    }
}