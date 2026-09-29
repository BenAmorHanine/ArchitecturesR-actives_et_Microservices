package tp1;
import tp1.application.*;
import tp1.domain.*;
import tp1.infrastructure.*;
import java.io.*;
public class TestRunner {
    static int fails = 0;
    static void check(String name, boolean ok) { System.out.println((ok ? "[OK]   " : "[FAIL] ") + name); if (!ok) fails++; }
    static String capture(Runnable r) {
        PrintStream old = System.out; ByteArrayOutputStream b = new ByteArrayOutputStream();
        System.setOut(new PrintStream(b)); r.run(); System.setOut(old); return b.toString();
    }
    public static void main(String[] a) {
        check("Factory BOOK", ProductFactory.createProduct("BOOK", "X", 1) instanceof Book);
        check("Factory FOOD", ProductFactory.createProduct("FOOD", "X", 1) instanceof Food);
        boolean thrown = false;
        try { ProductFactory.createProduct("???", "X", 1); } catch (IllegalArgumentException e) { thrown = true; }
        check("Factory type inconnu", thrown);
        check("Singleton", ApplicationConfig.getInstance() == ApplicationConfig.getInstance());
        check("Adapter", capture(() -> new PaymentAdapter(new OldPaymentSystem()).pay(250)).contains("Payment : 250.0"));
        String tree = capture(() -> new Category("C").add(new Category("B").add(new Book("b1", 1))).display(""));
        check("Composite", tree.contains("+ C") && tree.contains("+ B") && tree.contains("Book : b1"));
        String obs = capture(() -> {
            Order o = new Order(); o.attach(new EmailService()); o.attach(new StockService()); o.attach(new LoggerService());
            o.setStatus("SHIPPED");
        });
        check("Observer (3 notifs)", obs.contains("Email") && obs.contains("Stock") && obs.contains("Log"));
        check("Strategy WhatsApp", capture(() -> new NotificationService(new WhatsAppNotification()).send("hi")).contains("WhatsApp"));
        System.out.println(fails == 0 ? "\nTous les tests passent." : "\n" + fails + " test(s) en echec.");
        System.exit(fails);
    }
}
