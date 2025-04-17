import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        
        while(true){
            int a = scan.nextInt();
            if(a == -1) break;
            
            sum += a;
        }
        
        System.out.print(sum);
    }
}