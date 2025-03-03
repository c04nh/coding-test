import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        String[] inputArr = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(inputArr[i]));
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[M];

        inputArr = br.readLine().split(" ");

        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            if(set.contains(arr[i])) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }

        System.out.print(sb);
			
    }
}
