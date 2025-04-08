import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double w = scan.nextDouble();
        double h = scan.nextDouble();

        System.out.println(String.format("%.1f", w * h / 2));
        
    }
}



