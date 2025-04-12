import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String track = br.readLine();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            if(arr[i].equals(track)) cnt++;
        }

        System.out.print(cnt);
    }
}