import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((a == 60 && b == 60) && c == 60) System.out.print("Equilateral");
        else if(a + b + c == 180){
            if((a == b || a == c) || b == c) System.out.print("Isosceles");
            else System.out.print("Scalene");
        }else System.out.print("Error");
    }
}