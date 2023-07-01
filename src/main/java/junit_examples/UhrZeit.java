package junit;

import java.time.LocalDateTime;

public class UhrZeit {
    public int personsNeeded (LocalDateTime localDateTime) {
        int hour = localDateTime.getHour () ;
        if (hour <= 6 || hour > 18) {
            return 2;
        }else{
            return 4;
        }
    }
}
