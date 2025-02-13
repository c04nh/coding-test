import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<int[]> arr = new ArrayList<int[]>();;

        while(true){
            int[] nums = new int[2];
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a == 0 && b == 0) break;
            nums[0] = a;
            nums[1] = b;
            arr.add(nums);
        }

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i)[1] % arr.get(i)[0] == 0){
                System.out.println("factor");
            }else if(arr.get(i)[0] % arr.get(i)[1] == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}