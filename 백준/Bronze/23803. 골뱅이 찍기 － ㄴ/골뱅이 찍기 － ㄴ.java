import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N * 4; i++){
            for(int j = 0; j < N; j++){
                System.out.print("@");
            }
            System.out.println();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N * 5; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}



