package main.java.Customer_Feedback_Handler;

public class ContactRequestHandler extends FeedbackHandler {

    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageType.CONTACT_REQUEST;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("Contact request received.");
        System.out.println("Forwarded to customer service.");
        System.out.println("From: " + message.getSenderEmail());
        System.out.println("Details: " + message.getContent());
    }
}
