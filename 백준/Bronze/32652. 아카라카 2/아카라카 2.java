import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = "AKARAKA";
        
        for(int i = 1; i < N; i++){
            str += "RAKA";
        }
        
        System.out.print(str);
    }
}