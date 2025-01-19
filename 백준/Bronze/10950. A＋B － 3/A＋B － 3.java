import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        
        int[][] a = new int[len][2];
        
        for(int i = 0; i < len; i++){
            a[i][0] = scan.nextInt();
            a[i][1] = scan.nextInt();
        }
        
        for(int i = 0; i < len; i++){
            System.out.println(a[i][0] + a[i][1]);
        }
    }
}