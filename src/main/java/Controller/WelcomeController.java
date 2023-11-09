package Controller;

import edu.wgu.d387_sample_code.D387SampleCodeApplication;
import il8n.DisplayMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;

@RestController
public class WelcomeController {

    private D387SampleCodeApplication d387SampleCodeApplication;

    public WelcomeController(D387SampleCodeApplication d387SampleCodeApplication) {
        this.d387SampleCodeApplication = d387SampleCodeApplication;
    }

    @GetMapping("/welcomeMessages")
        public List<CompletableFuture<String>> getWelcomeMessages() {
            return d387SampleCodeApplication.getWelcomeMessages();
        }



}
