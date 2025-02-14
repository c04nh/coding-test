import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < N; i++){
            int chk = 0;
            for(int j = 1; j <= arr[i]; j++){
                if(arr[i] % j == 0) chk++;
            }
            if(chk == 2) cnt++;
        }

        System.out.print(cnt);
    }
}