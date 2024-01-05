package edu.wgu.d387_sample_code.il8n;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

@Service
public class DisplayMessage {

    //Utilizes  resource bundle to get the message based on the locale
    public static CompletableFuture<String> getWelcomeMessage(Locale locale) {
        return CompletableFuture.supplyAsync(() -> {
            ResourceBundle messages = ResourceBundle.getBundle("Translation", locale);
            return messages.getString("welcome");

        });
    }
}
