import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        int cnt = scan.nextInt();
        
        for(int i = 0; i < cnt; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            price -= a * b;
        }
        
        if(price == 0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}