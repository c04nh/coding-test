import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int price = 0;
        
        if(a == b && b == c){
            price = 10000 + a * 1000;
        }else if(a == b){
            price = 1000 + a * 100;
        }else if(a == c){
            price = 1000 + a * 100;
        }else if(b == c){
            price = 1000 + b * 100;
        }else{
            int max_num = Math.max(a, b);
            max_num = Math.max(max_num, c);
            price = max_num * 100;
        }
        
        System.out.println(price);
    }
}