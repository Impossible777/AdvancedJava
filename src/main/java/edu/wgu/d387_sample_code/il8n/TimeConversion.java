package edu.wgu.d387_sample_code.il8n;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
public class TimeConversion {



    public String changeTimeZone() {

        int hour = 12;
        int minute = 30;
        ZoneId easternZone = ZoneId.of("America/New_York");
        ZoneId mountainZone = ZoneId.of("America/Denver");
        ZoneId utcZone = ZoneId.of("UTC");


        ZonedDateTime zonedDateTime = ZonedDateTime.now()
                .withHour(hour)
                .withMinute(minute)
                .withSecond(0)
                .withZoneSameLocal(easternZone);

        String mountTime = zonedDateTime.withZoneSameInstant(mountainZone).toString();
        String utcTime = zonedDateTime.withZoneSameInstant(utcZone).toString();
        String easternTime = zonedDateTime.toString();
        return  "Eastern Time: " + easternTime + "\n" + "Mountain Time: " + mountTime + "\n" + "UTC Time: " + utcTime;
    }




}
