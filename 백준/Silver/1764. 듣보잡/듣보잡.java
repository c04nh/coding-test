import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputArr = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr[0]);
        int M = Integer.parseInt(inputArr[1]);

        Set<String> set1 = new HashSet();
        Set<String> set2 = new HashSet();

        for(int i = 0; i < N; i++){
            set1.add(br.readLine());
        }

        for(int i = 0; i < M; i++){
            set2.add(br.readLine());
        }

        set1.retainAll(set2);
        List<String> tempSet = new ArrayList<>(set1);
		Collections.sort(tempSet);

        bw.write(tempSet.size() + "\n");
        
        for(String s : tempSet){
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
			
    }
}