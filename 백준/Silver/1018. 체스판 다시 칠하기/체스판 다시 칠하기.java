import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        char[][] input = new char[M][N];
        int answer = 64;

        for(int i = 0; i < M; i++){
            String str = scan.next();
            input[i] = str.toCharArray();
        }

        char[][] arr1 = new char[M][N];
        char[][] arr2 = new char[M][N];

        char c1 = 'W';
        char c2 = 'B';
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr1[i][j] = c1;
                arr2[i][j] = c2;
                if(c1 == 'W') c1 = 'B';
                else c1 = 'W';
                if(c2 == 'W') c2 = 'B';
                else c2 = 'W';
            }
            if(arr1[i][0] == 'W') c1 = 'B';
            else c1 = 'W';
            if(arr2[i][0] == 'W') c2 = 'B';
            else c2 = 'W';
        }

        

        for(int m = 0; m <= M-8; m++){
            for(int n = 0; n <= N-8; n++){
                int cnt1 = 0;
                int cnt2 = 0;
                for(int i = m; i < m+8; i++){
                    for(int j = n; j < n+8; j++){
                        if(arr1[i][j] != input[i][j]) cnt1++;
                        if(arr2[i][j] != input[i][j]) cnt2++;
                    }
                }
                if(cnt1 < answer) answer = cnt1;
                if(cnt2 < answer) answer = cnt2;
            }
        }
        
        System.out.print(answer);  
        
    }
}