import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i = 0; i < N; i++){
            String[] inputArr = br.readLine().split(" ");
            if(inputArr[1].equals("enter")) set.add(inputArr[0]);
            else set.remove(inputArr[0]);
        }

        List<String> sortSet = new ArrayList<>(set);
		Collections.sort(sortSet, Collections.reverseOrder());

        for(String str: sortSet){
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
    }
}