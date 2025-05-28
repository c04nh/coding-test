import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int x = 1;
        
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            for(int j = 0; j < N; j++){
                arr = br.readLine().split(" ");
                int u = Integer.parseInt(arr[0]);
                int v = Integer.parseInt(arr[1]);
            }
            bw.write("Material Management " + x + "\n");
            bw.write("Classification ---- End!\n");
            x++;
        }

        bw.flush();
        bw.close();
    }
}