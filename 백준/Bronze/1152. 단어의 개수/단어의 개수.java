import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int answer = 1;

        if(str.equals(" ")){
            answer = 0;
        }else{
            for(int i = 1; i < str.length() - 1; i++){
                if(str.charAt(i) == ' ') answer++;
            }
        }

        System.out.print(answer);
        
    }
}