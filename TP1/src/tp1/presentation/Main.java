package tp1.presentation;
import tp1.application.*;
import tp1.domain.*;
import tp1.infrastructure.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory ===");
        ProductFactory.createProduct("BOOK", "Design Patterns", 45).display();
        new OrderService().createOrder("FOOD", "Pizza", 12);
        System.out.println("\n=== Singleton ===");
        System.out.println(ApplicationConfig.getInstance() == ApplicationConfig.getInstance());
        System.out.println("\n=== Adapter ===");
        PaymentService payment = new PaymentAdapter(new OldPaymentSystem());
        payment.pay(250);
        System.out.println("\n=== Composite ===");
        new Category("Catalogue")
            .add(new Category("Books").add(new Book("Book 1", 10)).add(new Book("Book 2", 12)))
            .add(new Category("Electronics").add(new Electronic("Laptop", 900)).add(new Electronic("Smartphone", 500)))
            .add(new Category("Clothing").add(new Clothing("Shirt", 20)).add(new Clothing("Jacket", 60)))
            .display("");
        System.out.println("\n=== Observer ===");
        Order order = new Order();
        order.attach(new EmailService()); order.attach(new StockService()); order.attach(new LoggerService());
        order.setStatus("SHIPPED");
        System.out.println("\n=== Strategy ===");
        new NotificationService(new EmailNotification()).send("Hello");
        new NotificationService(new WhatsAppNotification()).send("Hello");
    }
}
