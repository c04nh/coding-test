import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        while(true){
            int a = scan.nextInt();
            if(a == -1) break;
            arr.add(a);
        }

        for(int i = 0; i < arr.size(); i++){
            ArrayList<Integer> div = new ArrayList<>();
            for(int j = 1; j < arr.get(i); j++){
                if(arr.get(i) % j == 0) div.add(j);
            }
            int sum = 0;
            
            for(int j = 0; j < div.size(); j++){
                sum += div.get(j);
            }

            if(sum == arr.get(i)){
                System.out.print(arr.get(i) + " = " + div.get(0));
                for(int j = 1; j < div.size(); j++){
                    System.out.print(" + " + div.get(j));
                }
            }else{
                System.out.print(arr.get(i) + " is NOT perfect.");
            }
            System.out.println();
        }
        
    }
}