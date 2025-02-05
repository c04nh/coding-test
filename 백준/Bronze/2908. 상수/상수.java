import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        
        String reverseNum1 = "";
        String reverseNum2 = "";
        
        for(int i = 0; i < strNum1.length(); i++){
            reverseNum1 = strNum1.charAt(i) + reverseNum1;
        }
        
        for(int i = 0; i < strNum2.length(); i++){
            reverseNum2 = strNum2.charAt(i) + reverseNum2;
        }
        
        if(Integer.parseInt(reverseNum1) > Integer.parseInt(reverseNum2)){
            System.out.print(reverseNum1);
        }else{
            System.out.print(reverseNum2);
        }
    }
}