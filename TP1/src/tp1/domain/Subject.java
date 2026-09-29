package tp1.domain;
import java.util.*;
public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();
    public void attach(Observer o) { observers.add(o); }
    public void detach(Observer o) { observers.remove(o); }
    protected void notifyObservers(String status) { for (Observer o : observers) o.update(status); }
}
