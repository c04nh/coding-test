import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        
        if(m >= 45){
            m -= 45;
            System.out.println(h + " " + m);
        }else{
            if(h == 0){
                h = 23;
            }else{
                h -= 1;
            }
            m += 15;
            System.out.println(h + " " + m);
        }
    }
}