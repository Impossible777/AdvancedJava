package edu.wgu.d387_sample_code.Controller;

import edu.wgu.d387_sample_code.D387SampleCodeApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WelcomeController {

    private D387SampleCodeApplication d387SampleCodeApplication;

    public WelcomeController(D387SampleCodeApplication d387SampleCodeApplication) {
        this.d387SampleCodeApplication = d387SampleCodeApplication;
    }
    //Returns the welcome message to the Angular front-end.
    //Welcome message is retrieved from D837SampleCodeApplication.java
    @GetMapping("/welcomeMessages")
        public List<String> getWelcomeMessages() {
            System.out.println("Working");
            return d387SampleCodeApplication.getWelcomeMessages();
        }



}
