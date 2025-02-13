import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = scan.nextInt();
        int K = scan.nextInt();

        for(int i = 1; i <= N; i++){
            if(N % i == 0) arr.add(i);
        }

        if(arr.size() < K){
            System.out.print("0");
        }else{
            System.out.print(arr.get(K - 1));
        }
        
    }
}