package DependencyInversion;

public class Wrong {

    static class EmailService {
        public void sendMessage(String msg, String receiver) {
            System.out.println("Email sent to " + receiver + " with message: " + msg);
        }
    }

    static class SMSService {
        public void sendMessage(String msg, String receiver) {
            System.out.println("Email sent to " + receiver + " with message: " + msg);
        }
    }


    static class NotificationService {
        private EmailService emailService = new EmailService();
        private SMSService smsService = new SMSService();

        public void sendNotification(String msg, String receiver) {
            smsService.sendMessage(msg, receiver);
        }
    }

    public static void main(String[] args) {
        NotificationService notificationService1 = new NotificationService();
        NotificationService notificationService2 = new NotificationService();
        NotificationService notificationService3 = new NotificationService();

        notificationService1.sendNotification("Hallo", "Hiba");
        notificationService2.sendNotification("Hallo", "Hiba");
        notificationService3.sendNotification("Hallo", "Hiba");
    }
}
