package tp1.infrastructure;
import tp1.domain.Observer;
public class EmailService implements Observer { public void update(String s) { System.out.println("Email : commande " + s); } }
