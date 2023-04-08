package messaging.concrete.apps;

import messaging.abstraction.MessagingApp;

public class TelegramMessagingApp extends MessagingApp {
    @Override
    public void transportMessage() {
        System.out.println("Sending via Telegram");
    }
}
