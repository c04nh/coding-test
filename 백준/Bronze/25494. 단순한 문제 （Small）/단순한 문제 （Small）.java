import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        for(int i = 0; i < N; i++){
            int[] arr = new int[3];
            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();
            arr[2] = scan.nextInt();

            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
    }
}