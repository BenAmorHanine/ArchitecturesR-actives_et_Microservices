package tp1.domain;
public class Order extends Subject {
    private String status = "CREATED";
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; notifyObservers(status); }
}
