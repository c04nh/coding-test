import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for(int i = str.length() - 1; i >= 0; i--){
            arr[str.charAt(i) - 97] = i;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }

    }
}