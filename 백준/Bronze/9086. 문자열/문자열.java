import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] arr = new String[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = scan.next();
        }
        
        for(int i = 0; i < N; i++){
            System.out.println(arr[i].charAt(0) + "" + arr[i].charAt(arr[i].length()-1));
        }
    }
}