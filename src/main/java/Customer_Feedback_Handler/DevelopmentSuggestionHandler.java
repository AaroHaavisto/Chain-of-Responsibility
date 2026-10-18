package main.java.Customer_Feedback_Handler;

public class DevelopmentSuggestionHandler extends FeedbackHandler {

    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.DEVELOPMENT_SUGGESTION;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("Development suggestion received.");
        System.out.println("Suggestion logged for evaluation.");
        System.out.println("From: " + message.getSenderEmail());
        System.out.println("Details: " + message.getContent());
    }
}
