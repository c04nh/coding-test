import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        int x1 = arr[0][0];
        int y1 = arr[0][1];
        int x2 = arr[0][0];
        int y2 = arr[0][1];

        for(int i = 1; i < N; i++){
            if(arr[i][0] < x1) x1 = arr[i][0];
            if(arr[i][1] < y1) y1 = arr[i][1];
            if(arr[i][0] > x2) x2 = arr[i][0];
            if(arr[i][1] > y2) y2 = arr[i][1];
        }

        System.out.print((x2 - x1) * (y2 - y1));
    }
}