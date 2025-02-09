import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[100][100];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            for(int j = 100 - y - 10; j < 100 - y; j++){
                for(int k = x; k < x + 10; k++){
                    arr[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j] == 1) cnt++;
            }
        }

        System.out.print(cnt);
        
    }
}