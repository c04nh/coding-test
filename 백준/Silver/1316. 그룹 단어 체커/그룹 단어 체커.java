import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] str = new String[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            str[i] = scan.next();
        }

        for(int i = 0; i < N; i++){
            String newStr = String.valueOf(str[i].charAt(0));
            boolean chk = true;
            
            for(int j = 1; j < str[i].length(); j++){
                if(str[i].charAt(j) != newStr.charAt(newStr.length() - 1)){
                    newStr += str[i].charAt(j);
                }
            }

            for(int j = 0; j < newStr.length() - 1; j++){
                for(int k = j + 1; k < newStr.length(); k++){
                    if(newStr.charAt(j) == newStr.charAt(k)){
                        chk = false;
                        break;
                    }
                }
            }

            if(chk) cnt++;
        }

        System.out.print(cnt);

    }
}