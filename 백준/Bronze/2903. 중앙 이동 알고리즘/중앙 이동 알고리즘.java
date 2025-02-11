import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num = 2;

        for(int i = 0; i < N; i++){
            num = num * 2 - 1;
        }

        System.out.print((num*num));
    }
}