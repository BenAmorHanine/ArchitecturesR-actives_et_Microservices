package tp1.infrastructure;
import tp1.domain.Observer;
public class LoggerService implements Observer { public void update(String s) { System.out.println("Log : statut = " + s); } }
