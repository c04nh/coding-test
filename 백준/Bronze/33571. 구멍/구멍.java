import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int cnt = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'B'){
                cnt += 2;
            }else{
                if(ch == 'A' || ch == 'a' || ch == 'b' || ch == 'D' || ch == 'd' || ch == 'e' || ch == 'g' || ch == 'O' || ch == 'o' || ch == 'P' || ch == 'p' || ch == 'Q' || ch == 'q' || ch == 'R' || ch == '@') cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}