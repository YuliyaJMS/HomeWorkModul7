package Easy;

import java.time.LocalDateTime;

public class Clock {
    public void showTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Текущее время: " + currentTime);
    }


}
