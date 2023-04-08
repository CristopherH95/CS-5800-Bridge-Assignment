package messaging.concrete.messages;

import messaging.abstraction.Message;
import messaging.abstraction.MessagingApp;

public class VideoMessage extends Message {
    public VideoMessage(MessagingApp app) {
        super(app);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Video message sent");
    }
}
