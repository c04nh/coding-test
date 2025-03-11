import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] inputArr1 = br.readLine().split(" ");
        String[] inputArr2 = br.readLine().split(" ");

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set1Copy = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i < N; i++){
            set1.add(Integer.parseInt(inputArr1[i]));
            set1Copy.add(Integer.parseInt(inputArr1[i]));
        }

        for(int i = 0; i < M; i++){
            set2.add(Integer.parseInt(inputArr2[i]));
        }

        set1.removeAll(set2);
        set2.removeAll(set1Copy);

        bw.write((set1.size() + set2.size()) + "\n");
        bw.flush();
        bw.close();
			
    }
}