package messaging.concrete.messages;

import messaging.abstraction.Message;
import messaging.abstraction.MessagingApp;

public class ImageMessage extends Message {
    public ImageMessage(MessagingApp app) {
        super(app);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Image message sent");
    }
}
