import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        int answer = 0;

        for(int i = 0; i < str.length(); i++){
            answer += (int)str.charAt(i) - 48;
        }

        System.out.print(answer);

    }
}
