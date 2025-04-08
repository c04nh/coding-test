import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        int pow = 0;
        
        for(int i = 1; i <= N; i++){
            sum += i;
            pow += i * i * i;
        }

        System.out.println(sum);
        System.out.println(sum * sum);
        System.out.println(pow);
    }
}