import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] card = new int[N];

        for(int i = 0; i < N; i++){
            card[i] = scan.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    if(card[i] + card[j] + card[k] <= M && card[i] + card[j] + card[k] > sum) sum = card[i] + card[j] + card[k];
                }
            }
        }

        System.out.println(sum);

    }
}