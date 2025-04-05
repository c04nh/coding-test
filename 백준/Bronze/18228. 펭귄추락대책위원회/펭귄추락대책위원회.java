import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        boolean chk = false;

        for(int i = 0; i < N; i++){
            int input = scan.nextInt();
            if(input == -1){
                chk = true;
                continue;
            }
            if(!chk){
                left.add(input);
            }else{
                right.add(input);
            }
        }

        Collections.sort(left);
        Collections.sort(right);

        System.out.print(left.get(0) + right.get(0));
    }
}
