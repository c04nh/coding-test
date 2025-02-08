import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int maxNum = 0;
        int N = 1;
        int M = 1;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = scan.nextInt();

                if(maxNum < arr[i][j]){
                    maxNum = arr[i][j];
                    N = i + 1;
                    M = j + 1;
                }
            }
        }

        System.out.println(maxNum);
        System.out.print(N + " " + M);

    }
}