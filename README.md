Advanced Java

In this project for school, I was tasked with providing methods to enable improved localization and globalization of a hotel website. Please see below for an outline of how this was achieved.

1. Created resource bundles with a welcome message variable for English and French. These can be seen in Translation_en.properties and Translation_fr.properties

2. Created a DisplayMessage.java class. This class provides a method that takes the locale as an argument and returns a String with the welcome message from the appropraite resource translation file.

3. Created the WelcomeController.java to provide a REST controller that provides the front-end with an API endpoint that returns the results of the getWelcomeMessage method.

4. In the D387SampleCodeApplication.java class, I implemented a main method and initialized two instances of the Displaymessage class and method to return the welcome strings. Then, I returned the strings in an Array to be returned by the WelcomeController

5. Created the TimeConversion.java class. This class provides a method that returns times for multiple time zones. 

6. Created the TimeChangeController.java to provide a REST controller that provides the front end with an API endpoint that returns the results of the changeTimeZone method. 

After all the above was complete, I created a Dockerfile and ensured the project could be run successfully as a docker image. 

