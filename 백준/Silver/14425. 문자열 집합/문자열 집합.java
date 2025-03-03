import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr[0]);
        int M = Integer.parseInt(inputArr[1]);
        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }

        String[] arr = new String[M];

        for(int i = 0; i < M; i++){
            arr[i] = br.readLine();
        }

        int cnt = 0;

        for(int i = 0; i < M; i++){
            if(set.contains(arr[i])) cnt++;
        }

        System.out.print(cnt);
			
    }
}
