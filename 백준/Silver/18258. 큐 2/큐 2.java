import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<String> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");

            if(str.length == 2){
                queue.add(str[1]);
            }else{
                if(str[0].equals("pop")){
                    if(queue.size() == 0) bw.write(-1 + "\n");
                    else{
                        bw.write(queue.getFirst() + "\n");
                        queue.removeFirst();
                    }
                }else if(str[0].equals("size")){
                    bw.write(queue.size() + "\n");
                }else if(str[0].equals("empty")){
                    if(queue.size() == 0) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                }else if(str[0].equals("front")){
                    if(queue.size() == 0) bw.write(-1 + "\n");
                    else bw.write(queue.getFirst() + "\n");
                }else if(str[0].equals("back")){
                    if(queue.size() == 0) bw.write(-1 + "\n");
                    else bw.write(queue.getLast()+ "\n");
                }   
            }

        }

        bw.flush();
        bw.close();
    }
}