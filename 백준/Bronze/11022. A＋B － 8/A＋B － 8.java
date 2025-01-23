import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] str = new int[N][2];
        
        for(int i = 0; i < N; i++){
            str[i][0] = scan.nextInt();
            str[i][1] = scan.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            System.out.println("Case #" + (i+1) + ": " + str[i][0] + " + " + str[i][1] + " = " + (str[i][0] + str[i][1]));
        }
    }
}