public class NotificationFactory {
    public Notification createNotification(String x){
        if (x != null || !x.isEmpty()){
            switch (x){
                case "SMS":
                    return new SMSNotification();
                case "EMAIL":
                    return new EmailNotification();
                default:
                    throw new IllegalArgumentException("Error");
            }
        }else {
            return null;
        }
    }
}
