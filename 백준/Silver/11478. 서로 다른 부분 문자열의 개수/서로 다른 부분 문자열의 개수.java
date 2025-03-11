import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        for(int i = 0; i < input.length(); i++){
            getSubstring(i, input);
        }

        bw.write(set.size() + "\n");
        bw.flush();
        bw.close();
			
    }

    static Set<String> set = new HashSet<>();

    static void getSubstring(int n, String s) {
		for (int i = 0; i <= s.length() - n; i++) {
			set.add(s.substring(i, i + n));
		}
	}
}
