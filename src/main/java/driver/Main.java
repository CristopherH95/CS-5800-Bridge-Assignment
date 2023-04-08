package driver;

import messaging.abstraction.MessagingApp;
import messaging.concrete.apps.FacebookMessagingApp;
import messaging.concrete.apps.TelegramMessagingApp;
import messaging.concrete.apps.WhatsAppMessagingApp;
import messaging.concrete.messages.ImageMessage;
import messaging.concrete.messages.TextMessage;
import messaging.concrete.messages.VideoMessage;

public class Main {
    public static void main(String[] args) {
        FacebookMessagingApp facebookApp = new FacebookMessagingApp();
        WhatsAppMessagingApp whatsApp = new WhatsAppMessagingApp();
        TelegramMessagingApp telegramApp = new TelegramMessagingApp();

        testMessagingApp(facebookApp, "Facebook");
        testMessagingApp(whatsApp, "WhatsApp");
        testMessagingApp(telegramApp, "Telegram");
    }

    private static void testMessagingApp(MessagingApp app, String label) {
        System.out.printf("---- TESTING SERVICE: %s ----%n", label);
        TextMessage textMessage = new TextMessage(app);
        ImageMessage imageMessage = new ImageMessage(app);
        VideoMessage videoMessage = new VideoMessage(app);

        textMessage.sendMessage();
        imageMessage.sendMessage();
        videoMessage.sendMessage();
    }
}