public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notify by sending email");
    }
}
