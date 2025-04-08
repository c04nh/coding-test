import java.time.*;

class Main{
    public static void main(String[] args){
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));

        String str = utcTime.toString();
        String year = str.substring(0, 4);
        String month = str.substring(5, 7);
        String day = str.substring(8, 10);
        
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

    }
}



