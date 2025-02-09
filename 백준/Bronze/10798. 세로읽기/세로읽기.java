import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] arr = new String[5][15];
        int length = 1;

        for(int i = 0; i < 5; i++){
            String input = scan.next();
            for(int j = 0; j < input.length(); j++){
                arr[i][j] = String.valueOf(input.charAt(j));
            }
            if(length < input.length()) length = input.length();
        }

        for(int i = 0; i < length; i++){
            for(int j = 0; j < 5; j++){
                if(arr[j][i] != null){
                    System.out.print(arr[j][i]);
                }   
            }
        }
    }
}