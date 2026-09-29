package tp1.infrastructure;
import tp1.domain.Observer;
public class StockService implements Observer { public void update(String s) { System.out.println("Stock mis à jour : " + s); } }
