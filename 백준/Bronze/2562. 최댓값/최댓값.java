import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];
        
        for(int i = 0; i < 9; i++){
            arr[i] = scan.nextInt();
        }
        
        int max_num = arr[0];
        int index = 1;
        
        for(int i = 1; i < 9; i++){
            if(max_num < arr[i]){
                max_num = arr[i];
                index = i + 1;
            }
        }
        
        System.out.println(max_num);
        System.out.println(index);
    }
}