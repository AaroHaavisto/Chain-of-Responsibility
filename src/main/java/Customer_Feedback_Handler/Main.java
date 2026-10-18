package main.java.Customer_Feedback_Handler;

public class Main {

    public static void main(String[] args) {

        FeedbackHandler compensationHandler =
                new CompensationHandler();

        FeedbackHandler contactHandler =
                new ContactRequestHandler();

        FeedbackHandler developmentHandler =
                new DevelopmentSuggestionHandler();

        FeedbackHandler generalHandler =
                new GeneralFeedbackHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(generalHandler);

        Message[] messages = {
                new Message(
                    MessageType.COMPENSATION_CLAIM,
                    "My order arrived damaged.",
                    "alice@example.com"
                ),
                new Message(
                    MessageType.CONTACT_REQUEST,
                    "I would like to speak to customer service.",
                    "bob@example.com"
                ),
                new Message(
                    MessageType.DEVELOPMENT_SUGGESTION,
                    "Please add a dark mode to the application.",
                    "charlie@example.com"
                ),
                new Message(
                    MessageType.GENERAL_FEEDBACK,
                    "The service was excellent.",
                    "diana@example.com"
                )
        };

        for (Message message : messages) {
            System.out.println("\n--------------------");
            System.out.println("Message type: " + message.getType());

            compensationHandler.handle(message);
        }
    }
}
