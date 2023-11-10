package edu.wgu.d387_sample_code.Controller;

import edu.wgu.d387_sample_code.il8n.TimeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeChangeController {

    private final TimeConversion timeConversion;

    @Autowired
    public TimeChangeController(TimeConversion timeConversion) {
        this.timeConversion = timeConversion;
    }

    @GetMapping("/time")
    public String timeChange() {
        return timeConversion.changeTimeZone();
    }


}
