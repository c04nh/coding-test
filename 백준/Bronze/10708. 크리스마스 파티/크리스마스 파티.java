import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] target = new int[M];
        int[] score = new int[N];
        Arrays.fill(score, 0);

        for(int i = 0; i < M; i++){
            target[i] = scan.nextInt();
        }

        for(int i = 0; i < M; i++){
            int cnt = 0;
            for(int j = 0; j < N; j++){
                int a = scan.nextInt();
                if(a == target[i]) score[j]++;
                else cnt++;
            }
            score[target[i]-1] += cnt;
        }

        for(int i = 0; i < N; i++){
            System.out.println(score[i]);
        }
    }
}