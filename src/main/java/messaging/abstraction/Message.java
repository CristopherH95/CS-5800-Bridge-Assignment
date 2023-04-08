package messaging.abstraction;

public abstract class Message implements MessageType {
    MessagingApp app;

    public Message(MessagingApp app) {
        this.app = app;
    }

    @Override
    public void sendMessage() {
        app.transportMessage();
    }
}
