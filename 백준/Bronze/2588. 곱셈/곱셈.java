import java.util.Scanner;

public class Main{
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         
         int a = num2 % 10;
         int b = (num2 / 10) % 10;
         int c = (num2 / 100) % 10;
         
         System.out.println(num1 * a);
         System.out.println(num1 * b);
         System.out.println(num1 * c);
         System.out.println(num1 * num2);
    } 
}
