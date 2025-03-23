import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String total = "";

        String input = br.readLine();
        if(input.equals("brown")) total += "1";
        else if(input.equals("red")) total += "2";
        else if(input.equals("orange")) total += "3";
        else if(input.equals("yellow")) total += "4";
        else if(input.equals("green")) total += "5";
        else if(input.equals("blue")) total += "6";
        else if(input.equals("violet")) total += "7";
        else if(input.equals("grey")) total += "8";
        else if(input.equals("white")) total += "9";

        input = br.readLine();
        if(input.equals("black")) total += "0";
        else if(input.equals("brown")) total += "1";
        else if(input.equals("red")) total += "2";
        else if(input.equals("orange")) total += "3";
        else if(input.equals("yellow")) total += "4";
        else if(input.equals("green")) total += "5";
        else if(input.equals("blue")) total += "6";
        else if(input.equals("violet")) total += "7";
        else if(input.equals("grey")) total += "8";
        else if(input.equals("white")) total += "9";

        input = br.readLine();
        if(Integer.parseInt(total) == 0) total = "0";
        else{
            if(input.equals("brown")) total += "0";
            else if(input.equals("red")) total += "00";
            else if(input.equals("orange")) total += "000";
            else if(input.equals("yellow")) total += "0000";
            else if(input.equals("green")) total += "00000";
            else if(input.equals("blue")) total += "000000";
            else if(input.equals("violet")) total += "0000000";
            else if(input.equals("grey")) total += "00000000";
            else if(input.equals("white")) total += "000000000";
        }
        

        bw.write(total + "");
        bw.flush();
        bw.close();
    }
}