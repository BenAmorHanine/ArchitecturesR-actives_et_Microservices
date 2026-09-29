package tp1.infrastructure;
import tp1.domain.Notification;
public class PushNotification implements Notification { public void send(String s) { System.out.println("Sending Push Notification : " + s); } }
