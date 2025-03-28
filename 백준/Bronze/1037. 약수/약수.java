import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            arrList.add(scan.nextInt());
        }

        Collections.sort(arrList);

        int answer = arrList.get(0) * arrList.get(arrList.size()-1);

        System.out.print(answer);
        
    }
}