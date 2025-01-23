import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<int[]>();;
        
        while(scan.hasNext()) {
            int[] nums = new int[2];
            nums[0] = scan.nextInt();
            nums[1] = scan.nextInt();
            if(nums[0] == 0 && nums[1] == 0){
                break;
            }
            list.add(nums);
        }    
		
        for(int[] arr : list){
            System.out.println(arr[0] + arr[1]);
        }
        
    }
}

