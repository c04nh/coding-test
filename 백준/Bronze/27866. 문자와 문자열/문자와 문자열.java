import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int index = scan.nextInt();
        
        System.out.print(str.charAt(index-1));
    }
}