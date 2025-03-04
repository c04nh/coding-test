import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputArr = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr[0]);
        int M = Integer.parseInt(inputArr[1]);
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        for(int i = 0; i < N; i++){
            String input = br.readLine();
            map1.put(i+1, input);
            map2.put(input, i+1);
        }

        for(int i = 0; i < M; i++){
            String input = br.readLine();
            int key;
            try{
                key = Integer.parseInt(input);
                bw.write(map1.get(key) + "\n");
            }catch(Exception e){
                bw.write(map2.get(input) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}