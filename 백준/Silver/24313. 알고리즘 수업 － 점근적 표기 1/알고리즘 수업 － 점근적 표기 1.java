import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int n = scan.nextInt();

        int fn = a * n + b;
        int cgn = c * n;

        if(fn <= cgn && a <= c) System.out.println(1);
        else System.out.println(0);

    }
}