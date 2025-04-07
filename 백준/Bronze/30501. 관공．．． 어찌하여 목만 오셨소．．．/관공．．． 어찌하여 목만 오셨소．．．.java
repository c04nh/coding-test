import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        for(int i = 0; i < N; i++){
            String str = scan.next();
            
            if(str.contains("S")) System.out.print(str);
        }
    }
}