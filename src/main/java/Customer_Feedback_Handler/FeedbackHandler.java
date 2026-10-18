package main.java.Customer_Feedback_Handler;

public abstract class FeedbackHandler {

    private FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Message message) {
        if (canHandle(message)) {
            processMessage(message);
        } else if (nextHandler != null) {
            nextHandler.handle(message);
        } else {
            System.out.println("No handler found for: "
                    + message.getType());
        }
    }

    protected abstract boolean canHandle(Message message);

    protected abstract void processMessage(Message message);
}
