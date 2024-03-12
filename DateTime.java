// package java.time
import java.time.LocalDateTime;                             // LocalDateTime
import java.time.format.DateTimeFormatter;                  // DateTimeFormatter


public class DateTime {
    public static void main(String [] args){

        LocalDateTime time = LocalDateTime.now();
        System.out.println("Old Date Time = "+time);

        // MM = Month Number      &      MMM = Month Name       &    E = WeekDay
//        DateTimeFormatter newtime =  DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
//        DateTimeFormatter newtime =  DateTimeFormatter.ofPattern("dd-MMM-yyyy  HH:mm:ss");
//        DateTimeFormatter newtime =  DateTimeFormatter.ofPattern("E, dd-MM-yyyy  HH:mm:ss");
        DateTimeFormatter newtime =  DateTimeFormatter.ofPattern("E, dd-MMM-yyyy  HH:mm:ss");

        String formated = time.format(newtime);

        System.out.println("New Date Time = "+formated);
    }
}
