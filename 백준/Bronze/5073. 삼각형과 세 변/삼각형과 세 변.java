import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<int[]>();

        while(true){
            int[] arr = new int[3];
            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();
            arr[2] = scan.nextInt();

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            list.add(arr);
        }

        for(int i = 0; i < list.size(); i++){
            Arrays.sort(list.get(i));
            if(list.get(i)[0] + list.get(i)[1] > list.get(i)[2]){
                if(list.get(i)[0] == list.get(i)[2]) System.out.println("Equilateral");
                else if(list.get(i)[0] == list.get(i)[1] || list.get(i)[1] == list.get(i)[2]) System.out.println("Isosceles");
                else System.out.println("Scalene");
            }else System.out.println("Invalid");
        }
    }
}