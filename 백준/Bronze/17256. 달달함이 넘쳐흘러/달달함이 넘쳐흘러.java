import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ax = scan.nextInt();
        int ay = scan.nextInt();
        int az = scan.nextInt();
        int cx = scan.nextInt();
        int cy = scan.nextInt();
        int cz = scan.nextInt();

        System.out.print((cx - az) + " " + (cy / ay) + " " + (cz - ax));
    }
}