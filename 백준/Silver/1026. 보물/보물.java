import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr1 = new Integer[N];
        Integer[] arr2 = new Integer[N];

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            arr1[i] = Integer.parseInt(input1[i]);
            arr2[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr1[i] * arr2[i];
        }

        System.out.print(sum);
    }
}