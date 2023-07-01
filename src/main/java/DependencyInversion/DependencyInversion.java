package DependencyInversion;

public class DependencyInversion {

    interface MessagesService {
        void sendMessage(String msg, String receiver);
    }

    static class EmailService implements MessagesService {
        public void sendMessage(String msg, String receiver) {
            System.out.println("Email sent to " + receiver + " with message: " + msg);
        }
    }

    static class WhatsappService implements MessagesService {
        public void sendMessage(String msg, String receiver) {
            System.out.println("Whatsapp message sent to " + receiver + " with message: " + msg);
        }
    }

    static class SMSService implements MessagesService {
        public void sendMessage(String msg, String receiver) {
            System.out.println("SMS sent to " + receiver + " with message: " + msg);
        }
    }

    static class NotificationService {

        private MessagesService messagesService;

        public NotificationService(MessagesService messagesService) {
            this.messagesService = messagesService;
        }

        public void sendNotification(String msg, String receiver) {
            messagesService.sendMessage(msg, receiver);
        }
    }

    public static void main(String[] args) {
        NotificationService notificationService1 = new NotificationService(new EmailService());
        NotificationService notificationService2 = new NotificationService(new WhatsappService());
        NotificationService notificationService3 = new NotificationService(new SMSService());

        notificationService1.sendNotification("Hallo", "Hiba");
        notificationService2.sendNotification("Hallo", "Hiba");
        notificationService3.sendNotification("Hallo", "Hiba");
    }
}
