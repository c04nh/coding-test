import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
		
        int[][] arr = new int[N][2];

        String[] inputArr = br.readLine().split(" ");
        
		for(int i = 0; i < N; i++) {
			arr[i][0] = Integer.parseInt(inputArr[i]);
            arr[i][1] = i;
		}

        Arrays.sort(arr, (a1, a2) -> {
            return a1[0] - a2[0];
        });

        int[] answer = new int[N];
        int index = 0;
        answer[arr[0][1]] = index;

        
        for(int i = 1; i < N; i++){
            if(arr[i][0] != arr[i-1][0]) index++;
            answer[arr[i][1]] = index;
        }

        for(int i = 0; i < N; i++){
            bw.write(answer[i] + " ");
        }

        bw.flush(); 
        bw.close();
 
				
	}

}