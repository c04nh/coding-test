import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 1; k < i*2; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = num - 1; i > 0; i--){
            for(int j = i; j < num; j++){
                System.out.print(" ");
            }
            for(int k = i * 2 - 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}