import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double[] arr = new double[N];
        double max_num = 0;
        double avg = 0;
        
        for(int i = 0; i < N; i++){
            arr[i] = scan.nextDouble();
            if(max_num < arr[i]) max_num = arr[i];
        } 

        for(int i = 0; i < N; i++){
            arr[i] = (double)(arr[i] / max_num) * 100.0;
        }

        for(int i = 0; i < N; i++){
            avg += arr[i];
        }

        avg /= N;

        System.out.print(avg);
    }
}