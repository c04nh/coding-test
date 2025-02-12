import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a, b;
        int cnt = 0;
        int i = 1;

        while(i <= N){
            cnt++;
            i += cnt;
        }

        if(cnt % 2 == 0){
            a = 1;
            b = cnt;
            for(int j = i - cnt; j < N; j++){
                a++;
                b--;
            }
        }else{
            b = 1;
            a = cnt;
            for(int j = i - cnt; j < N; j++){
                a--;
                b++;
            }
        }
            
        System.out.print(a + "/" + b);

    }
}