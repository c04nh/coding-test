import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] arr = new String[N];
        Arrays.fill(arr, "");

        for(int i = 0; i < N; i++){
            int r = scan.nextInt();
            String str = scan.next();
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < r; k++){
                    arr[i] += String.valueOf(str.charAt(j));
                }
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }
    }
}