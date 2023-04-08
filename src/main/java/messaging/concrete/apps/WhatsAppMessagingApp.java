package messaging.concrete.apps;

import messaging.abstraction.MessagingApp;

public class WhatsAppMessagingApp extends MessagingApp {
    @Override
    public void transportMessage() {
        System.out.println("Sending via WhatsApp");
    }
}
