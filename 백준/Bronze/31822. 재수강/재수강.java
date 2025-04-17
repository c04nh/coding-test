import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String code = scan.next();
        int N = scan.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            String input = scan.next();

            if(code.substring(0, 5).equals(input.substring(0, 5))) cnt++;
        }

        System.out.print(cnt);
    }
}