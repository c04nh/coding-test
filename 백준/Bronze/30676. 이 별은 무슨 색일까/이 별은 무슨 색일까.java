import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if(input >= 620) System.out.print("Red");
        else if(input >= 590) System.out.print("Orange");
        else if(input >= 570) System.out.print("Yellow");
        else if(input >= 495) System.out.print("Green");
        else if(input >= 450) System.out.print("Blue");
        else if(input >= 425) System.out.print("Indigo");
        else System.out.print("Violet");
    }
}



