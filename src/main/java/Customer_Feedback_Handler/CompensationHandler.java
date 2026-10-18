package main.java.Customer_Feedback_Handler;

public class CompensationHandler extends FeedbackHandler {

    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.COMPENSATION_CLAIM;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("Compensation claim received.");
        System.out.println("Claim is under review.");
        System.out.println("From: " + message.getSenderEmail());
        System.out.println("Details: " + message.getContent());
    }
}
