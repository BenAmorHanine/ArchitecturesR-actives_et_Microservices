package tp1.infrastructure;
import tp1.domain.Notification;
public class SmsNotification implements Notification { public void send(String s) { System.out.println("Sending SMS : " + s); } }
