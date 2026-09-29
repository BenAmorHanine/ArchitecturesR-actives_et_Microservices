package tp1.domain;
public interface Product extends CatalogItem {
    String getName();
    double getPrice();
    default void display() { display(""); }
}
