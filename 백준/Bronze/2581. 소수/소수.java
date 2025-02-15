import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = M; i <= N; i++){
            int a = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) a++;
            }

            if(a == 2) arr.add(i);
            
        }

        if(arr.size() == 0){
            System.out.print(-1);
        }else{
            int sum = 0;
            for(int i = 0; i < arr.size(); i++){
                sum += arr.get(i);
            }
            System.out.println(sum);
            System.out.println(arr.get(0));
        }
    }
}