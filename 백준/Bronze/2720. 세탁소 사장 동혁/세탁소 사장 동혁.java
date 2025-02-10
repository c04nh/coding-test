import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < N; i++){
            int money = arr[i];
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;
            
            while(true){
                if(money >= 25){
                    q = (int)(money / 25);
                    money = money % 25;
                }else if(money >= 10){
                    d = (int)(money / 10);
                    money = money % 10;
                }else if(money >= 5){
                    n = (int)(money / 5);
                    money = money % 5;
                }else{
                    p = money;
                    break;
                }
            }
            
            System.out.println(q + " " + d + " " + n + " " + p);
        }
        
    }
}