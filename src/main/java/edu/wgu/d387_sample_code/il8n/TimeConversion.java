package edu.wgu.d387_sample_code.il8n;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeConversion {


    //Utilizes java.time imports to return the time in three different time zones
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

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm a");

        String mountTime = zonedDateTime.withZoneSameInstant(mountainZone).format(formatter);
        String utcTime = zonedDateTime.withZoneSameInstant(utcZone).format(formatter);
        String easternTime = zonedDateTime.format(formatter);
        return  "<p><strong>ET: </strong> " + easternTime + "</p>"
                + "<p><strong>MT:</strong> " + mountTime + "</p>"
                + "<p><strong>UTC:</strong> " + utcTime + "</p>";
    }




}
