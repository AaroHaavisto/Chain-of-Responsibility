package main.java.Customer_Feedback_Handler;

public class GeneralFeedbackHandler extends FeedbackHandler {

    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.GENERAL_FEEDBACK;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("General feedback received.");
        System.out.println("Thank you for your feedback!");
        System.out.println("From: " + message.getSenderEmail());
        System.out.println("Details: " + message.getContent());
    }
}
