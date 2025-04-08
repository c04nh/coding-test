import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if(str.equals("NLCS")) System.out.print("North London Collegiate School");
        else if(str.equals("BHA")) System.out.print("Branksome Hall Asia");
        else if(str.equals("KIS")) System.out.print("Korea International School");
        else if(str.equals("SJA")) System.out.print("St. Johnsbury Academy");

    }
}



