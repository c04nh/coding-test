import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        
        for(int i = 0; i < arr.length; i++){
            String input = br.readLine();
            String[] inputArr = input.split(" ");
            arr[i][0] = Integer.parseInt(inputArr[0]);
            arr[i][1] = Integer.parseInt(inputArr[1]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0]-o2[0];
            }
            return o1[1]-o2[1];
        });
        
        for(int i = 0; i < N; i++){
            bw.write(arr[i][0] + " " + arr[i][1] + "\n"); 
        }

        bw.flush(); 
        bw.close();
    }
}
