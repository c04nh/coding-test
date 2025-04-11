import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double N = scan.nextDouble();
        
        System.out.print((int)(Math.ceil(N / 5)));
    }
}