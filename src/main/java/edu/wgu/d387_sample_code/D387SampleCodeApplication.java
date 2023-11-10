package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.il8n.DisplayMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class D387SampleCodeApplication {

	private static ArrayList<String> welcomeMessages = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		Locale locale1 = Locale.US;
		Locale locale2 = Locale.FRANCE;

		CompletableFuture<String> welcomeMessageFuture1 = DisplayMessage.getWelcomeMessage(locale1);
		CompletableFuture<String> welcomeMessageFuture2 = DisplayMessage.getWelcomeMessage(locale2);


		String welcomeMessage1 = welcomeMessageFuture1.join();
		String welcomeMessage2 = welcomeMessageFuture2.join();


		welcomeMessages.add(welcomeMessage1);
		welcomeMessages.add(welcomeMessage2);




	}



	public ArrayList<String> getWelcomeMessages() {
		return welcomeMessages;
	}









}
