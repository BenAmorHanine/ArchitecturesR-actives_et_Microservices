package tp1.application;
import tp1.domain.Notification;
public class NotificationService {
    private final Notification strategy;
    public NotificationService(Notification strategy) { this.strategy = strategy; }
    public void send(String message) { strategy.send(message); }
}
