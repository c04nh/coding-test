import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();

        Arrays.sort(arr);

        if(arr[0] + arr[1] > arr[2]) System.out.println(arr[0] + arr[1] + arr[2]);
        else System.out.println((arr[0] + arr[1]) * 2 - 1);
    }
}