import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String mbti = scan.next();
        
        if(mbti.charAt(0) == 'E') System.out.print("I");
        else System.out.print("E");
        
        if(mbti.charAt(1) == 'S') System.out.print("N");
        else System.out.print("S");
        
        if(mbti.charAt(2) == 'T') System.out.print("F");
        else System.out.print("T");
        
        if(mbti.charAt(3) == 'J') System.out.print("P");
        else System.out.print("J");
    }
}