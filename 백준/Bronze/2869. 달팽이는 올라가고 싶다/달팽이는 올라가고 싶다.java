import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextInt();
        double B = scan.nextInt();
        double V = scan.nextInt();
        int answer = 0;

        answer = (int)Math.ceil((V - A) / (A - B)) + 1;     

        System.out.print(answer);

    }
}