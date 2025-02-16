import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int min_num = x;

        if(min_num > y) min_num = y;
        if(min_num > w - x) min_num = w - x;
        if(min_num > h - y) min_num = h - y;

        System.out.print(min_num);
    }
}