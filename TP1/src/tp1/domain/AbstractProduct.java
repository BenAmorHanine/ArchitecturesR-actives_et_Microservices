package tp1.domain;
public abstract class AbstractProduct implements Product {
    private final String name; private final double price;
    protected AbstractProduct(String name, double price) { this.name = name; this.price = price; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void display(String indent) {
        System.out.println(indent + getClass().getSimpleName() + " : " + name + " (" + price + ")");
    }
}
