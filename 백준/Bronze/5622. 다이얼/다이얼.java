import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int second = 0;
        
        for(int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case 'A':
                    second += 3;
                    break;
                case 'B':
                    second += 3;
                    break;
                case 'C':
                    second += 3;
                    break;
                case 'D':
                    second += 4;
                    break;
                case 'E':
                    second += 4;
                    break;
                case 'F':
                    second += 4;
                    break;
                case 'G':
                    second += 5;
                    break;
                case 'H':
                    second += 5;
                    break;
                case 'I':
                    second += 5;
                    break;
                case 'J':
                    second += 6;
                    break;
                case 'K':
                    second += 6;
                    break;
                case 'L':
                    second += 6;
                    break;
                case 'M':
                    second += 7;
                    break;
                case 'N':
                    second += 7;
                    break;
                case 'O':
                    second += 7;
                    break;
                case 'P':
                    second += 8;
                    break;
                case 'Q':
                    second += 8;
                    break;
                case 'R':
                    second += 8;
                    break;
                case 'S':
                    second += 8;
                    break;
                case 'T':
                    second += 9;
                    break;
                case 'U':
                    second += 9;
                    break;
                case 'V':
                    second += 9;
                    break;
                case 'W':
                    second += 10;
                    break;
                case 'X':
                    second += 10;
                    break;
                case 'Y':
                    second += 10;
                    break;
                case 'Z':
                    second += 10;
                    break;
            }
        }
        
        System.out.print(second);
        
    }
}